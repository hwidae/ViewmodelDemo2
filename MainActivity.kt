package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    var cntnmb = 0
    private lateinit var viewModle: MainActivityViewModle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModle = ViewModelProvider(this).get(MainActivityViewModle::class.java)
        val tvcount = findViewById<TextView>(R.id.tvCount)
        val btncount = findViewById<Button>(R.id.btnCount)
        //tvcount.text = cntnum.toString()
        //tvcount.text = viewModle.cntnmb.toString()
//        viewModle.cntnmb.observe(this, {
//            tvcount.text = it.toString()
//        })
        viewModle.cntnmb.observe(this, {
            tvcount.text = it.toString()
        })
        btncount.setOnClickListener{
            //cntnum += 1
            //tvcount.text = cntnum.toString()
            viewModle.updateCntnmb()
            //tvcount.text = viewModle.cntnmb.toString()
        }
    }
}