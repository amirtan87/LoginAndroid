package in.parsel.pvr.ui.activities;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by patch on 10/06/16.
 */

public class MyLocationListenerActivity implements LocationListener {
    public void onLocationChanged(Location location) {
        if (location != null) {
        }
    }        public void onProviderDisabled(String provider) {
        // TODO Auto-generated method stub
    }

    public void onProviderEnabled(String provider) {
        // TODO Auto-generated method stub
    }

    public void onStatusChanged(String provider, int status, Bundle extras) {
        // TODO Auto-generated method stub
    }
}