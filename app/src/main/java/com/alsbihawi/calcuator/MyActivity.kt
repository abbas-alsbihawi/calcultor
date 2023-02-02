package com.alsbihawi.calcuator

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar


class MyActivity : AppCompatActivity() {

    lateinit var constraintLayoutActivity:ConstraintLayout
    lateinit var textUsername:EditText
    lateinit var myButton:Button
    lateinit var switchTheme:Switch
    lateinit var checkBoxOne:CheckBox
    lateinit var checkBoxTwo:CheckBox
    lateinit var checkBoxThree:CheckBox
    lateinit var radioGroup:RadioGroup
    lateinit var radioButtonMale:RadioButton
    lateinit var radioButtonFemale:RadioButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)
        Log.i(LOG_TAG,"on Create Activity")
        initViews()
        addCallBacks()
    }

    private fun addCallBacks() {
        myButton.setOnClickListener{


            myButton.text=getString(R.string.hello_abbas)
            Snackbar.make(it,"my Snackbar is done and ${textUsername.text}",Snackbar.LENGTH_LONG).show()
            Toast.makeText(this,"my Toast is done and ${textUsername.text}",Toast.LENGTH_LONG).show()
            Log.i(LOG_TAG,"on Create Snackbar and Toast ")
        }
        switchTheme.setOnCheckedChangeListener {  _, isChecked ->
            switchTheme.text= if (!isChecked) "Dark" else "Light"
            updateBackgroundActivity(isChecked) }

    }

    private fun updateBackgroundActivity(isChecked: Boolean) {
       var background = if (isChecked) ContextCompat.getColor(this,R.color.background) else  ContextCompat.getColor(this,R.color.white)
        var  backgroundImag =ContextCompat.getDrawable(this,R.drawable.abbas)
        if (isChecked)
            constraintLayoutActivity.setBackgroundColor(background)
      else  constraintLayoutActivity.background=backgroundImag

    }

    private fun initViews() {
        constraintLayoutActivity=findViewById(R.id.constraint_layout_activity)
        textUsername=findViewById(R.id.text_username)
        myButton=findViewById(R.id.button_my_clickable)
        switchTheme=findViewById(R.id.switch_theme)
        radioGroup=findViewById(R.id.radioGroup)
        radioButtonMale=findViewById(R.id.radio_button_male)
        radioButtonFemale=findViewById(R.id.radio_button_female)
        checkBoxOne=findViewById(R.id.checkbox_one)
        checkBoxTwo=findViewById(R.id.checkbox_two)
        checkBoxThree=findViewById(R.id.checkbox_three)
    }
    companion object{
        const val LOG_TAG="MyActivity"
    }

}