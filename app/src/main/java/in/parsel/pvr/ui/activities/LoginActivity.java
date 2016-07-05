package in.parsel.pvr.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import java.util.Map;

import in.parsel.pvr.R;
import in.parsel.pvr.constants.Constants;
import in.parsel.pvr.core.GsonRequest;
import in.parsel.pvr.model.input.LoginRequest;
import in.parsel.pvr.model.output.LoginOutput;
import in.parsel.pvr.utils.ModelUtil;

public class LoginActivity extends AppCompatActivity implements Response.Listener, Response.ErrorListener ,View.OnClickListener{


    private EditText etUsername;
    private EditText etPassword;
    private Button   bLogin ;
    private TextView registerLink ;
    private final int progressDialogRequestCode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        prepareControls();
        subscribeEvents();
    }

    protected void prepareControls() {

        etUsername   = (EditText) findViewById(R.id.etUsername);
        etPassword   = (EditText) findViewById(R.id.etPassword);
        bLogin       = (Button)findViewById(R.id.bLogin);
        registerLink = (TextView)findViewById(R.id.tvRegister);
    }

    protected void subscribeEvents() {

        bLogin.setOnClickListener(this);
        registerLink.setOnClickListener(this);
       etPassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == R.id.login || id == EditorInfo.IME_NULL) {
                    doLogin();
                    return true;
                }
                return false;
            }
        });
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.bLogin: {
                doLogin();
            }
            break ;

        }
    }

    private void doLogin(){

        etUsername.setError(null);
        etPassword.setError(null);

         String username = etUsername.getText().toString();
         String password = etPassword.getText().toString();

        boolean cancel = false;
        View focusView = null;

        if (TextUtils.isEmpty(password) || !isPasswordValid(password)) {
            etPassword.setError(getString(R.string.error_invalid_password));
            focusView = etPassword;
            cancel = true;
        }

        if (TextUtils.isEmpty(username)) {
            etUsername.setError(getString(R.string.error_field_required));
            focusView = etUsername;
            cancel = true;


        }else if (!isEmailValid(username)) {
            etUsername.setError(getString(R.string.error_invalid_email));
            focusView = etUsername;
            cancel = true;
        }

        if (cancel) {
            focusView.requestFocus();
        } else {
            try {

                Map<String, String> mHeaders = new ArrayMap<String, String>();
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(new GsonRequest(Constants.URL.LOGIN, Request.Method.POST, LoginOutput.class, mHeaders, getLoginJSON(username, password), this, this));

            }catch (Exception e) {
                dismissProgress();
                Log.getStackTraceString(e);
            }
        }

    }

    public void dismissProgress() {
        finishActivity(progressDialogRequestCode);
    }

    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

    private String getLoginJSON(String username, String password) {

        LoginRequest request = new LoginRequest();
        request.setUsername(username);
        request.setPassword(password);
        return ModelUtil.serialize(request);
    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }

    @Override
    public void onResponse(Object response) {

        LoginOutput loginOutput = (LoginOutput) response;
        if(loginOutput.getResponseCode().equalsIgnoreCase(LoginOutput.SUC_RESP_CODE)){

            Intent k = new Intent(this, MapNavigationActivity.class);
            startActivity(k);


        }else {
            Context context = getApplicationContext();
            CharSequence text = "Wrong Credentails";
            int duration = Toast.LENGTH_LONG ;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
