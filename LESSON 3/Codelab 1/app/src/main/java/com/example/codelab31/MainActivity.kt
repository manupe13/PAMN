package com.example.codelab31

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun suma(view: View) {
        val txtN1: EditText = findViewById(R.id.txtN1)
        val n1: BigDecimal = BigDecimal(txtN1.text.toString())
        val txtN2: EditText = findViewById(R.id.txtN2)
        val n2: BigDecimal = BigDecimal(txtN2.text.toString())

        val txtResult: TextView = findViewById(R.id.textView)
        val res = n1.add(n2)
        txtResult.text = res.toString()
    }
    @SuppressLint("SetTextI18n")
    fun resta(view: View) {
        val txtN1: EditText = findViewById(R.id.txtN1)
        val n1: BigDecimal = BigDecimal(txtN1.text.toString())
        val txtN2: EditText = findViewById(R.id.txtN2)
        val n2: BigDecimal = BigDecimal(txtN2.text.toString())

        val txtResult: TextView = findViewById(R.id.textView)
        val res = n1.subtract(n2)
        txtResult.text = res.toString()
    }
    @SuppressLint("SetTextI18n")
    fun dividir(view: View) {
        val txtN1: EditText = findViewById(R.id.txtN1)
        val n1: BigDecimal = BigDecimal(txtN1.text.toString())
        val txtN2: EditText = findViewById(R.id.txtN2)
        val n2: BigDecimal = BigDecimal(txtN2.text.toString())

        val txtResult: TextView = findViewById(R.id.textView)
        if(n2 != BigDecimal("0.0")){
            val res = n1.divide(n2)
            txtResult.text = res.toString()
        }else{
            txtResult.text = "NAN"
        }
    }
    @SuppressLint("SetTextI18n")
    fun multiplicar(view: View) {
        val txtN1: EditText = findViewById(R.id.txtN1)
        val n1: BigDecimal = BigDecimal(txtN1.text.toString())
        val txtN2: EditText = findViewById(R.id.txtN2)
        val n2: BigDecimal = BigDecimal(txtN2.text.toString())

        val txtResult: TextView = findViewById(R.id.textView)
        val res = n1.multiply(n2)
        txtResult.text = res.toString()
    }
}