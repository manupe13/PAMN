package com.example.codelab33

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    val colores: Array<String> = arrayOf("rojo", "verde", "amarillo", "violeta", "azul", "naranja")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            val txt: TextView = findViewById(R.id.txtHello)
            txt.setTextColor(savedInstanceState.getInt("color"));
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val txt: TextView = findViewById(R.id.txtHello)
        outState.putInt("color", txt.currentTextColor)
    }

    fun changeColor(view: View) {
        val random: Random = Random()
        val color: String = colores[random.nextInt(6)]

        val colorResourceName = resources.getIdentifier(color, "color", applicationContext.packageName)
        val colorRes: Int = resources.getColor(colorResourceName, this.theme)

        val txt: TextView = findViewById(R.id.txtHello)
        txt.setTextColor(colorRes)
    }
}