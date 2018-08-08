package com.akandro.www.locationserviceapp

import android.annotation.SuppressLint
import android.content.Context
import android.hardware.input.InputManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var IManager = getSystemService(Context.LOCATION_SERVICE)
        as LocationManager

        IManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,
                1000,1.toFloat(), object : LocationListener{
            override fun onProviderEnabled(p0: String?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onProviderDisabled(p0: String?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onStatusChanged(p0: String?, p1: Int, p2: Bundle?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onLocationChanged(p0: Location?) {

                textView.text = p0!!.latitude.toString()
                textView2.text = p0!!.longitude.toString()
                IManager.removeUpdates(this)




            }






        })



    }
}
