package com.example.mapfragment.models

import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng

abstract class Polyline(latLng: List<LatLng>, width: Float, color: Int, tag: String) {

    lateinit var latLng: List<LatLng>
    var width: Float = 0f
    var color: Int = 0
    lateinit var tag: String
    var boolean: Boolean = false
    lateinit var polyline: Polyline

    fun createPolyLine(
        map: GoogleMap,
        latLng: List<LatLng>,
        width: Float,
        color: Int,
        tag: String
    ) {


    }


}