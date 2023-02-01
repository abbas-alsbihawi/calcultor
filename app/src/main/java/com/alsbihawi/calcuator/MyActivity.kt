package com.alsbihawi.calcuator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MyActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var textTitle:TextView
    lateinit var myButton:Button
     var myListener=MyListener()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)
        textTitle=findViewById(R.id.textTitle)
        myButton=findViewById(R.id.myButton)
        textTitle.text = "hi abbas"

//        one a way
        myButton.setOnClickListener(myListener)
//        two a way
        myButton.setOnClickListener(this)
//        three a way
        myButton.setOnClickListener{
            myButton.text="hi button"
        }
    }

    override fun onClick(v: View?) {
       myButton.text="hi button"
    }
}