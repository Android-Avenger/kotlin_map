package com.example.mapfragment

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mapfragment.databinding.ActivityMainBinding
import com.google.android.gms.dynamic.SupportFragmentWrapper
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.*
import javax.xml.transform.Result

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var googleMap: GoogleMap


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(mBinding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(this)

    }

    override fun onMapReady(map: GoogleMap) {

        googleMap = map


        map.uiSettings.setCompassEnabled(true)

        val latLng = arrayListOf(

            LatLng(31.467156942384996, 43.69397661374925),
            LatLng(64.22600361086207, 79.2017875666138),
            LatLng(33.395741177843604, 93.96741192325055),
            LatLng(50.820561010215044, 48.08850767227208),
            LatLng(50.70937891814292, 94.14319316559147),
            LatLng(31.467156942384996, 43.69397661374925)
        )

        val polyline = map.addPolyline(
            PolylineOptions()

                .clickable(true)
                .addAll(latLng)
                .width(2f)
                .color(Color.BLUE)
        )

        for (i in latLng) {

            val marker = map.addMarker(
                MarkerOptions()
                    .position(i)
            );
        }
    }

}
