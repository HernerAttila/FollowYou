package com.example.torpe.teszt;

/**
 * Created by Torpe on 2017. 02. 21..
 */

public class SendDataObject {
    protected double Latitude;
    protected double Longitude;
    protected String Time;
    protected int userId;
    protected int statusCode;

    public SendDataObject ( double Latitude, double Longitude, String Time, int userId, int statusCode){
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Time = Time;
        this.userId = userId;
        this.statusCode = statusCode;
    }
}
