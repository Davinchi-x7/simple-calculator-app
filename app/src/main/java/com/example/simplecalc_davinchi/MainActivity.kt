package com.example.simplecalc_davinchi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txt_answer_display:TextView
    private lateinit var Edt_first:EditText
    private lateinit var Edt_second:EditText
    private lateinit var add_btn:Button
    private lateinit var mul_btn:Button
    private lateinit var div_btn:Button
    private lateinit var sub_btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //instantiate variables
        txt_answer_display = findViewById(R.id.answer)
        Edt_first = findViewById(R.id.edt_firstnumber)
        Edt_second = findViewById(R.id.edt_secondnumber)
        add_btn = findViewById(R.id.addbtn)
        mul_btn = findViewById(R.id.btn_multi)
        sub_btn = findViewById(R.id.btn_sub)
        div_btn = findViewById(R.id.btn_div)


        add_btn.setOnClickListener {

            var first_num = Edt_first.text.toString().trim() //50
            var second_num = Edt_second.text.toString().trim() //20

            //validation of edit text
            if (first_num.isEmpty() || second_num.isEmpty()){

                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                //means has some data
                var result = first_num.toDouble() + second_num.toDouble()
                txt_answer_display.text = result.toString()
            }

        }
        mul_btn.setOnClickListener {

            var first_num = Edt_first.text.toString().trim() //50
            var second_num = Edt_second.text.toString().trim() //20

            if (first_num.isEmpty() || second_num.isEmpty()){
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()

            }
            else{
                //means has some data
                var result = first_num.toDouble() * second_num.toDouble()
                txt_answer_display.text = result.toString()
            }

        }
        sub_btn.setOnClickListener {

            var first_num = Edt_first.text.toString().trim() //50
            var second_num = Edt_second.text.toString().trim() //20

            if (first_num.isEmpty() || second_num.isEmpty()){
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()

            }
            else{
                //means has some data
                var result = first_num.toDouble() - second_num.toDouble()
                txt_answer_display.text = result.toString()
            }

        }
        div_btn.setOnClickListener {

            var first_num = Edt_first.text.toString().trim() //50
            var second_num = Edt_second.text.toString().trim() //20

            if (first_num.isEmpty() || second_num.isEmpty()){
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()

            }
            else{
                //means has some data
                var result = first_num.toDouble() / second_num.toDouble()
                txt_answer_display.text = result.toString()
            }

        }

    }
}