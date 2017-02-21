package com.example.torpe.teszt;

/**
 * Location imports
 */
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

/**
 * Service imports
 */
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Bundle;

/**
 * Created by Torpe on 2017. 02. 19..
 */


public class TrackGPS extends Service implements LocationListener {


    /**
     *
     */
    boolean checkGPS = false;

    boolean checkNetwork = false;

    boolean canGetLocation = false;

    Location loc;
    double latitude;
    double longitude;

    public TrackGPS() {

    }

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