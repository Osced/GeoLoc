package com.example.geoloc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    private static final long MIN_TIME = 10000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textView = findViewById(R.id.textView);

         if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED
         && ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION)!=PackageManager.PERMISSION_GRANTED){
             ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION,},1000);
         }else {
             iniciarLocalizacion();
         }
    }
    private void iniciarLocalizacion(){
        LocationManager locationManager =(LocationManager)getSystemService(Context.LOCATION_SERVICE);
        Localizacion local = new Localizacion();
        local.setMainActivity(this,textView);
        final boolean gpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        if(!gpsEnabled){
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivity(intent);
        }
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION)!=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION,},1000);
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,MIN_TIME,0,local);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,MIN_TIME,0,local);
        textView.setText("Localizacion Agregada");
    }
    public void onRequestPermissionsResult(int requestCode,String[] permissions,int[] grantResults){
        if(requestCode==1000){
            if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
                iniciarLocalizacion();
                return;
            }
        }
    }
}
