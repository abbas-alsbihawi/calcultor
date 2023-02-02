package com.alsbihawi.calcuator

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.alsbihawi.calcuator.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {


    private var lastNumber:Double=0.0
    private var currentOperation:Operation?=null
    lateinit var binding: ActivityCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallBacks()
    }

    private fun addCallBacks() {
        binding.buttonClear.setOnClickListener{  clearInput() }

        binding.buttonPlus.setOnClickListener{
              bindingOperation(Operation.PLUS)
        }
        binding.buttonMinas.setOnClickListener{
            bindingOperation(Operation.MINAS)
        }
        binding.buttonMultiple.setOnClickListener{
            bindingOperation(Operation.MUL)
        }
        binding.buttonDivide.setOnClickListener{
            bindingOperation(Operation.DIV)
        }


        binding.buttonResult.setOnClickListener{
          val result= doCurrentOperation()
           binding.textResult.text= result.toString()
        }

    }

    private fun doCurrentOperation() :Double =when(currentOperation){
            Operation.PLUS -> lastNumber +binding.textResult.text.toString().toDouble()
            Operation.MINAS -> lastNumber -binding.textResult.text.toString().toDouble()
            Operation.MUL -> lastNumber *binding.textResult.text.toString().toDouble()
            Operation.DIV -> lastNumber /binding.textResult.text.toString().toDouble()
            else -> 0.0
        }


    private fun bindingOperation(operation: Operation) {
        lastNumber=binding.textResult.text.toString().toDouble()
        currentOperation=operation
        clearInput()

    }

    private fun clearInput() {
        binding.textResult.text=""
//        binding.textOperation.text=""
    }

    fun  onClickDigit(view: View){
       val newDigit= (view as AppCompatButton).text.toString()
         val oldDigit=binding.textResult.text.toString()
        val resultDigit= oldDigit+newDigit
        binding.textResult.text=resultDigit
    }

}