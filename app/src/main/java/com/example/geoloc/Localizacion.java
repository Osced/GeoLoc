package com.example.geoloc;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationProvider;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import static android.content.ContentValues.TAG;

public class Localizacion implements LocationListener {
    MainActivity mainActivity;
    TextView textView;

    public MainActivity getMainActivity(){
        return mainActivity;
    }
    public void setMainActivity(MainActivity mainActivity,TextView textView){
        this.mainActivity = mainActivity;
        this.textView = textView;
    }
    @Override
    public void onLocationChanged(Location location) {
        mapa(location.getLatitude(),location.getLongitude());
    }
    public void mapa(double lat, double lng){
        FragmentMaps fragment = new FragmentMaps();
        Bundle bundle = new Bundle();
        bundle.putDouble("lat",new Double(lat));
        bundle.putDouble("lng",new Double(lng));
        fragment.setArguments(bundle);

        FragmentManager fragmentManager = getMainActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment,fragment,null);
        fragmentTransaction.commit();
    }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        switch (status){
            case LocationProvider.AVAILABLE:
                Log.d("debug", "LocationProvider.AVAIBLE");
            case LocationProvider.OUT_OF_SERVICE:
                Log.d("debug", "LocationProvider.OUT_OF_SERVICE");
            case LocationProvider.TEMPORARILY_UNAVAILABLE:
                Log.d("debug", "LocationProvider.TEMPORARILY_UNAVAILABLE");
        }
    }

    @Override
    public void onProviderEnabled(String provider) {
        textView.setText("GPS Activado");
    }

    @Override
    public void onProviderDisabled(String provider) {
        textView.setText("GPS Desactivado");
    }
}
