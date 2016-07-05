package in.parsel.pvr.ui.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

import in.parsel.pvr.R;

public class BatteryIndicatorActivity extends AppCompatActivity {


    private BroadcastReceiver mBatInfoReceiver = new BroadcastReceiver() {

        //When Event is published, onReceive method is called
        public void onReceive(Context c, Intent i) {
            //Get Battery %
            int level = i.getIntExtra("level", 0);
            //Find the progressbar creating in main.xml
            ProgressBar pb = (ProgressBar) findViewById(R.id.progressbar);
            //Set progress level with battery % value
            pb.setProgress(level);
            //Find textview control created in main.xml
            TextView tv = (TextView) findViewById(R.id.textfield);
            //Set TextView with text
            tv.setText("Battery Level: " + "Shutdown" + "%");
        }
    } ;

    /** int scale = -1;
        int level = -1;
        int voltage = -1;
        int temp = -1;

        @Override
        public void onReceive(Context context, Intent intent) {
            level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
            scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
            temp = intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, -1);
            voltage = intent.getIntExtra(BatteryManager.EXTRA_VOLTAGE, -1);
            Toast.makeText(context, "BAttery's dying!!", Toast.LENGTH_LONG).show();
            Log.e("", "BATTERY LOW!!");
        }
    };**/

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery_indicator);
            //Register the receiver which triggers event
            //when battery charge is changed
            registerReceiver(mBatInfoReceiver, new IntentFilter(
                    Intent.ACTION_BATTERY_LOW));

    }
}
