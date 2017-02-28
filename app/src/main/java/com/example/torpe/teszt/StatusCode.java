package com.example.torpe.teszt;

/**
 * Created by Torpe on 2017. 02. 28..
 * statusCode bázis
 * 0 -> minden rendben
 * 1 -> GPS nem elérhető
 * 2 -> G4 kikapcsolva
 * 3 -> megtelt a puffer
 */

public class StatusCode {
    private boolean gpsEnabled = false;
    private boolean gpsError = false;
    private boolean g4Error = false;
    private boolean pufferFull = false;

    public void setG4Error(boolean g4Error) {
        this.g4Error = g4Error;
    }

    public void setPufferFull(boolean pufferFull) {
        this.pufferFull = pufferFull;
    }

    public void setGpsEnabled(boolean gpsEnabled) {
        this.gpsEnabled = gpsEnabled;
    }

    public void setGpsError(boolean gpsError) {
        this.gpsError = gpsError;
    }

    public int getStatusCode (){
        if( this.gpsError ){
            return 1;
        }
        if( this.g4Error ){
            return 2;
        }
        if( this.pufferFull ){
            return 3;
        }
        return  0;
    }
}

