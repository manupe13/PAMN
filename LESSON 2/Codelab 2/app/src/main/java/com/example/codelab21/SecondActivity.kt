package com.example.codelab21

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var texto: Button
    val LOG_TAG = this.toString().split(".")[3]

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(LOG_TAG, "---------")
        Log.d(LOG_TAG, "onCreate")

        val message = intent.getStringExtra("message")
        val txtMsg: TextView = findViewById(R.id.message)
        txtMsg.text=message
    }

    fun onClick(v: View) {
        when(v.id) {
            R.id.button1 -> texto = findViewById(R.id.button1)
            R.id.button2 -> texto = findViewById(R.id.button2)
            R.id.button3 -> texto = findViewById(R.id.button3)
            R.id.button4 -> texto = findViewById(R.id.button4)
            R.id.button5 -> texto = findViewById(R.id.button5)
            R.id.button6 -> texto = findViewById(R.id.button6)
        }
        val intent= Intent(this, MainActivity::class.java)
        Log.d("comida", texto.text.toString())
        intent.putExtra("comida", texto.text.toString())
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart")
    }
    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }
    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }
    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }

    fun returnReply(view: View) {
        val intent= Intent(this, MainActivity::class.java)
        val texto: EditText = findViewById(R.id.editText_main2)
        intent.putExtra("message", texto.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
}