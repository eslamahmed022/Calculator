package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var isNewop=true
    var op=""
    var num1=0
    var num2=0
    fun onClick(view: View){
        if(isNewop)
            out.text=""
        var text:String=out.text.toString()

        isNewop=false
        val button=view as Button

        when(button.id){
            R.id.bu0 ->{
                text += "0"
            }
            R.id.bu1->{
                text += "1"

            }
            R.id.bu2->{
                text += "2"

            }
            R.id.bu3->{
                text += "3"

            }
            R.id.bu4->{
                text += "4"

            }
            R.id.bu5->{
                text += "5"

            }
            R.id.bu6->{
                text += "6"

            }
            R.id.bu7->{
                text += "7"

            }
            R.id.bu8->{
                text += "8"

            }
            R.id.bu9->{
                text += "9"
            }
            R.id.buplus->{
                num1=out.text.toString().toInt()
                op="+"
                isNewop=true
            }
            R.id.bumines->{
                num1=out.text.toString().toInt()
                op="-"
                isNewop=true
            }
            R.id.budivision->{
                num1=out.text.toString().toInt()
                op="/"
                isNewop=true
            }
            R.id.bumul->{
                num1=out.text.toString().toInt()
                op="*"
                isNewop=true
            }
            R.id.bubrs->{
                num1=out.text.toString().toInt()
                op="%"
                isNewop=true
            }
            R.id.buplusmin->{
                 val num3=-1*(out.text.toString().toInt())
                text=num3.toString()
            }
            R.id.buequal->{
                equal()
                num1=out.text.toString().toInt()

                text=num1.toString()
            }
        }
        out.text=text
    }


    fun equal(){
        when(op){
            "+"->{
                num1 += out.text.toString().toInt()
                out.text=num1.toString()
            }
            "-"->{
                num1 -= out.text.toString().toInt()
                out.text=num1.toString()
            }
            "*"->{
                num1 *= out.text.toString().toInt()
                out.text=num1.toString()
            }
            "/"->{
                num1 /= out.text.toString().toInt()
                out.text=num1.toString()
            }
            "%"->{
                num1 %= out.text.toString().toInt()
                out.text=num1.toString()
            }


        }
    }
}
