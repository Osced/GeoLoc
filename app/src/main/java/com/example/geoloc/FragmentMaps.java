package com.example.geoloc;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class FragmentMaps extends SupportMapFragment implements OnMapReadyCallback {
    double lat,lng;
    private LatLng camara1 = new LatLng(6.22, -75.576640273);
    private LatLng camara2 = new LatLng(6.20683606, -75.586204166);
    private LatLng camara3 = new LatLng(6.207424, -75.589221);
    private LatLng camara4 = new LatLng(6.186832788, -75.561675364);
    private LatLng camara5 = new LatLng(6.238922, -75.596935);
    private LatLng camara6 = new LatLng(6.244196, -75.606684);
    private LatLng camara7 = new LatLng(6.2412, -75.56965);
    private LatLng camara8 = new LatLng(6.213157, -75.576821);
    private LatLng camara9 = new LatLng(6.231336288, -75.569976651);
    private LatLng camara10 = new LatLng(6.22, -75.57676);
    private LatLng camara11 = new LatLng(6.245775531, -75.573071561);
    private LatLng camara12 = new LatLng(6.20683606, -75.586204166);
    private LatLng camara13 = new LatLng(6.20665647, -75.586091091);
    private LatLng camara14 = new LatLng(6.276353, -75.573492);
    private LatLng camara15 = new LatLng(6.229072698, -75.571371667);
    private LatLng camara16 = new LatLng(6.244176652, -75.569893531);
    private LatLng camara17 = new LatLng(6.250409954, -75.572537061);
    private LatLng camara18 = new LatLng(6.249200576, -75.588862652);
    private LatLng camara19 = new LatLng(6.197542789, -75.589845564);
    private LatLng camara20 = new LatLng(6.294444851, -75.567623167);
    private LatLng camara21= new LatLng(6.21587, -75.57813);
    private LatLng camara22= new LatLng(6.25497, -75.563);
    private LatLng camara23= new LatLng(6.209026469, -75.558978063);
    private LatLng camara24= new LatLng(6.1857, -75.57);
    private LatLng camara25= new LatLng(6.23872, -75.59023);
    private LatLng camara26 = new LatLng(6.253168, -75.562302);
    private LatLng camara27= new LatLng(6.245775531, -75.573071561);
    private LatLng camara28= new LatLng(6.264515, -75.567323);
    private LatLng camara29= new LatLng(6.301296319, -75.566157667);
    private LatLng camara30= new LatLng(6.282165465, -75.572242152);
    private LatLng camara31 = new LatLng(6.253083, -75.587965);
    private LatLng camara32 = new LatLng(6.261455, -75.564201);
    private LatLng camara33 = new LatLng(6.219340592, -75.599279362);
    private LatLng camara34= new LatLng(6.239293349, -75.573480273);
    private LatLng camara35 = new LatLng(6.24466779, -75.566549181);
    private LatLng camara36 = new LatLng(6.251474148, -75.571888563);
    private LatLng camara37 = new LatLng(6.270353849, -75.573924492);
    private LatLng camara38= new LatLng(6.25799, -75.57215);
    private LatLng camara39 = new LatLng(6.24453, -75.57082);
    private LatLng camara40 = new LatLng(6.21247, -75.57471);
    private LatLng camara41 = new LatLng(6.2878, -75.5698);
    private LatLng camara42 = new LatLng(6.188750001, -75.58305);
    private LatLng camara43 = new LatLng(6.2389, -75.57755);
    private LatLng camara44 = new LatLng(6.236430001, -75.57603);
    private LatLng camara45 = new LatLng(6.270746788, -75.571413758);
    private LatLng camara46 = new LatLng(6.247040001, -75.56501);
    private LatLng camara47 = new LatLng(6.209717016, -75.5707205);
    private LatLng camara48 = new LatLng(6.2202, -75.5665);
    private LatLng camara49 = new LatLng(6.191787153, -75.567380045);
    private LatLng camara50 = new LatLng(6.226688746, -75.583632803);
    private LatLng camara51 = new LatLng(6.231839135, -75.587190273);
    private LatLng camara52 = new LatLng(6.231241047, -75.59616697);
    private LatLng camara53 = new LatLng(6.2097, -75.5656);
    private LatLng camara54= new LatLng(6.2098, -75.5682);
    private LatLng camara55 = new LatLng(6.256050001, -75.58114);
    private LatLng camara56 = new LatLng(6.25611, -75.580896879);
    private LatLng camara57 = new LatLng(6.25, -75.5971);
    private LatLng camara58= new LatLng(6.243532802, -75.602845878);
    private LatLng camara59 = new LatLng(6.217969954, -75.575845513);
    private LatLng camara60 = new LatLng(6.238407, -75.573431);
    private LatLng camara61 = new LatLng(6.289224107, -75.570420121);
    private LatLng camara62 = new LatLng(6.28779, -75.569788);
    private LatLng camara63 = new LatLng(6.203232591, -75.579916349);
    private LatLng camara64 = new LatLng(6.275150771, -75.570431394);
    private LatLng camara65 = new LatLng(6.215886, -75.552608);
    private LatLng camara66 = new LatLng(6.190085, -75.582638);
    private LatLng camara67 = new LatLng(6.222478, -75.579693);
    private LatLng camara68 = new LatLng(6.290459442, -75.564969496);
    private LatLng camara69 = new LatLng(6.261484, -75.556477);
    private LatLng camara70 = new LatLng(6.277354, -75.589461);
    private LatLng camara71 = new LatLng(6.22018, -75.580224);
    private LatLng camara72 = new LatLng(6.189723993, -75.560768038);
    private LatLng camara73 = new LatLng(6.222737, -75.591992);
    private LatLng camara74 = new LatLng(6.259756001, -75.582788);
    private LatLng camara75 = new LatLng(6.278924001, -75.644719);
    private LatLng camara76 = new LatLng(6.196556576, -75.585255876);
    private LatLng PueblitoPaisa = new LatLng(6.2518401, -75.563591);
    private LatLng PlazaMayor = new LatLng(6.2435, -75.5762);
    private LatLng PlazaBotero = new LatLng(6.252, -75.5684);
    private LatLng EscalerasComuna = new LatLng(6.2487869, -75.6215321);
    private LatLng UniversidadAntioquia = new LatLng(6.2672, -75.5692);
    private LatLng CerroNutibara = new LatLng(6.2358, -75.5797);
    private LatLng CatedralBasilica = new LatLng(6.2499975, -75.5674956);


    public FragmentMaps(){}

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View rootView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if(getArguments() != null){
                this.lat = getArguments().getDouble("lat");
                this.lng = getArguments().getDouble("lng");
        }
        getMapAsync(this);
        return rootView;
    }

    @Override

    public void onMapReady(GoogleMap googleMap) {
        LatLng latLng = new LatLng(lat,lng);

        float zoom = 17;

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,zoom));
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        googleMap.addMarker(new MarkerOptions().position(latLng));
        UiSettings settings = googleMap.getUiSettings();
        settings.setZoomControlsEnabled(true);
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara1));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara2));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara3));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara4));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara5));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara6));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara7));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara8));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara9));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara10));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara11));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara12));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara13));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara14));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara15));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara16));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara17));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara18));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara19));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara20));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara21));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara22));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara23));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara24));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara25));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara26));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara27));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara28));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara29));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara30));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara31));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara32));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara33));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara34));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara35));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara36));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara37));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara38));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara39));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara40));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara41));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara42));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara43));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara44));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara45));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara46));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara47));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara48));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara49));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara50));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara51));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara52));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara53));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara54));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara55));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara56));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara57));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara58));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara59));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara60));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara61));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara62));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara63));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara64));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara65));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara66));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara67));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara68));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara69));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara70));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara71));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara72));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara73));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara74));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara75));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).position(camara76));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_interes)).position(PlazaBotero));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_interes)).position(PlazaMayor));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_interes)).position(PueblitoPaisa));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_interes)).position(CatedralBasilica));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_interes)).position(CerroNutibara));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_interes)).position(EscalerasComuna));
        googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_interes)).position(UniversidadAntioquia));

      }
}
