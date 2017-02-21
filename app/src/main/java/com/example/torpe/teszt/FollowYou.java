package com.example.torpe.teszt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.Calendar;
import java.text.SimpleDateFormat;


/**
 * Created by Torpe on 2017. 02. 19..
 */

public class FollowYou extends Service {
    private static String TAG = "FollowYou";
    private TrackGPS GPS = new TrackGPS();
    Calendar c = Calendar.getInstance();;
    SimpleDateFormat df = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
    String formattedDate = df.format(c.getTime());
    @Override
    public IBinder onBind(Intent arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        // TODO Auto-generated method stub
        super.onStart(intent, startId);
        double Longitude = GPS.getLongitude();
        double Latitude = GPS.getLatitude();

        Log.d(TAG, "FollowYou started");
        Log.d(TAG, "Longitude".concat( new Double(Longitude).toString() ) );
        Log.d(TAG, "Latitude".concat( new Double(Latitude).toString() ) );
        Log.d(TAG, "DateTime: " + formattedDate );
        ServerCommunication communication = new ServerCommunication();
        communication.SendLocation(Latitude,Longitude,formattedDate);
        this.stopSelf();
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.d(TAG, "FollowYou destroyed");
    }
}
