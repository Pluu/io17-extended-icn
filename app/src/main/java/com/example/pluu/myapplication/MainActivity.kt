package com.example.pluu.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        findViewById<TextView>(android.R.id.text1)?.apply {
//            val font: Typeface? = ResourcesCompat.getFont(context, R.font.arizonia)
//            typeface = font
//        }

//        val request = FontRequest("com.example.fontprovider.authority",
//                "com.example.fontprovider", "my font", certs)
//        val callback = FontsContractCompat .FontRequestCallback()
//
//        FontsContractCompat.requestFont(this, request, callback, Handler())

    }
}
