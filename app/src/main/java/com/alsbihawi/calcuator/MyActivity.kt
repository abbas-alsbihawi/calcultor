package com.alsbihawi.calcuator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MyActivity : AppCompatActivity() {
    lateinit var textTitle:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)
        textTitle=findViewById(R.id.textTitle)

        textTitle.text = "hi abbas"
    }
}