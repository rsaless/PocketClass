package br.com.rafael.pocketclass;

import android.content.Context;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;


public class Localizador {

    public Localizador(Context context){
        GoogleApiClient client = new GoogleApiClient.Builder(context)
                .addApi(LocationServices.API)
                .addConnectionCallbacks()
                .build();

        client.connect();
    }
}
