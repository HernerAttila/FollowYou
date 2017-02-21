package com.example.torpe.teszt;

/**
 * Created by Torpe on 2017. 02. 19..
 */

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;

public class Starter extends Activity {
    private static String TAG = "Starter";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"ittvagyok");
        startService(new Intent(this, FollowYou.class));
    }

}