package com.example.codelab21

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.PackageManagerCompat.LOG_TAG

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("RestrictedApi")
    fun launchSecondActivity(view: View) {
        //Contexto de la aplicacion
        val context = view.context
        Log.d(context.toString().split(".")[3].split("@")[0], "Button clicked")
        //Con las 2 líneas de abajo se pasa de la primera pantalla a la segunda
        val intent= Intent(this, SecondActivity::class.java)
        val texto: EditText  = findViewById(R.id.editText_main)
        intent.putExtra("message", texto.text.toString())
        context.startActivity(intent)

    }
}