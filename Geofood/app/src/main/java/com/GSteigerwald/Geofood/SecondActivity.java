package com.GSteigerwald.Geofood;



        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.OnMapReadyCallback;
        import com.google.android.gms.maps.SupportMapFragment;
        import com.google.android.gms.maps.model.LatLng;
        import com.google.android.gms.maps.model.MarkerOptions;



public class SecondActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng sydney = new LatLng(48.8146745822124, 2.37864574491058);
        googleMap.addMarker(new MarkerOptions().position(sydney)
                .title("Chez Marwan").snippet("143 Avenue Maurice Thorez, 94200 Ivry-sur-Seine\nLe fastfood préféré des étudiants !"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }
}
