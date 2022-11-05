package com.example.codelab21

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent;
        val message = intent.getStringExtra("message")
        val txtMsg: TextView = findViewById(R.id.message)
        txtMsg.text=message
    }

    fun returnReply(view: View) {
        val intent= Intent(this, MainActivity::class.java)
        val texto: EditText = findViewById(R.id.editText_main2)
        intent.putExtra("message", texto.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
}