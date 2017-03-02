package com.example.torpe.teszt;

/**
 * Location imports
 */

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

/**
 * Service imports
 */
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

/**
 * Created by Torpe on 2017. 02. 19..
 */


public class TrackGPS extends Service implements LocationListener {


    /**
     *
     */
    boolean checkGPS = false;

    boolean checkNetwork = false;
//    boolean mobileConnected = false;
//    boolean wifiConnected = false;

    boolean canGetLocation = false;

    final private int RequestLocationAcces = 1;

    Location loc;
    LocationManager locManager;
    double latitude;
    double longitude;

    public TrackGPS() {
        locManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//        if (Build.VERSION.SDK_INT >= 23) {
//            check_permission();
//        }

    }

//    private void check_permission() {
//        if (ActivityCompat.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)
//                == PackageManager.PERMISSION_GRANTED) {
//            canGetLocation = true;
//            start_gps();
//        } else {
//            ActivityCompat.requestPermissions(this,
//                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
//                    RequestLocationAcces);
//        }
//    }

//    @Override
//    public void onRequestPermissionsResult(int requestCode,
//                                           String permissions[], int[] grantResults) {
//        switch (requestCode) {
//            case RequestLocationAcces: {
//                // If request is cancelled, the result arrays are empty.
//                if (grantResults.length > 0
//                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//
//                    // permission was granted, yay! Do the
//                    // contacts-related task you need to do.
//                    canGetLocation = true;
//                    start_gps();
//
//                } else {
//
//                    // permission denied, boo! Disable the
//                    // functionality that depends on this permission.
//                    canGetLocation = false;
//                }
//                return;
//            }
//
//            // other 'case' lines to check for other
//            // permissions this app might request
//        }
//    }

//    private void checkNetworkConnection() {
//        ConnectivityManager connMgr =
//                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo activeInfo = connMgr.getActiveNetworkInfo();
//        if (activeInfo != null && activeInfo.isConnected()) {
//            wifiConnected = activeInfo.getType() == ConnectivityManager.TYPE_WIFI;
//            mobileConnected = activeInfo.getType() == ConnectivityManager.TYPE_MOBILE;
//            if(wifiConnected) {
//                Log.i(TAG, getString(R.string.wifi_connection));
//            } else if (mobileConnected){
//                Log.i(TAG, getString(R.string.mobile_connection));
//            }
//        } else {
//            Log.i(TAG, getString(R.string.no_wifi_or_mobile));
//        }
//    }

//    void start_gps() {
//        locManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
//    }

    public double getLongitude() {
        if (loc != null) {
            longitude = loc.getLongitude();
        }
        return longitude;
    }

    public double getLatitude() {
        if (loc != null) {
            latitude = loc.getLatitude();
        }
        return latitude;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}