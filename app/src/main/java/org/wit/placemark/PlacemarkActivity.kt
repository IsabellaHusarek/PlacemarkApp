package org.wit.placemark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber // for logging
import timber.log.Timber.i

class PlacemarkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark)

        Timber.plant(Timber.DebugTree()) //for logging - initialise java timber by planting a tree
        i("Placemark Activity started..")
    }
}