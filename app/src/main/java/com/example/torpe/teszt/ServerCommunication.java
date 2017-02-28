package com.example.torpe.teszt;

import android.util.Log;

import com.google.gson.Gson;

/**
 * Created by Torpe on 2017. 02. 19..
 */

public class ServerCommunication {
    private Gson gson = new Gson();
    private int USER_ID = 122313;
    private static String TAG = "Starter";

    public void SendLocation(double latitude, double longitude, String Time, int StatusCode) {
        SendDataObject[] sendDataArray = new  SendDataObject[4];
        SendDataObject sendData = new SendDataObject(latitude,longitude,Time,this.USER_ID,StatusCode);
        sendDataArray[0] = sendData;
        sendDataArray[1] = sendData;
        sendDataArray[2] = sendData;
        sendDataArray[3] = sendData;
        String formattedDate = this.gson.toJson(sendDataArray);
        Log.d(TAG, "SendLocation:" + formattedDate);
    }
}

