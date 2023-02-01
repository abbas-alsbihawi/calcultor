package com.alsbihawi.calcuator

import android.view.View
import android.widget.Button

class MyListener :View.OnClickListener{
    override fun onClick(v: View?) {
        ( v as Button).text="hi button"
    }


}