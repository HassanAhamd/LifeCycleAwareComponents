package com.gtaskmanager.lifecyclerawarcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observers())
        Log.d("Main","Hello Activity OnCreate")
    }

    override fun onPause(){
        super.onPause()
        Log.d("Main","Hello Activity OnPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d("Main","Hello Activity OnStop")
    }

    override fun onResume(){
        super.onResume()
        Log.d("Main","Hello Activity OnResume")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d("Main","Hello Activity OnDestroy")
    }
}