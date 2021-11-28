package com.example.myapplication

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Весна, весна, пора любви,")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Как тяжко мне твое явленье")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Какое томное волненье")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"В моей душе, в моей крови…")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Как чуждо сердцу наслажденье…")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"Все, что ликует и блестит,")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Наводит скуку и томленье.")
    }


}