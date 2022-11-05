package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    /* AppCompatActivity una clase de compatibilidad que garantiza que su actividad
     * se vea igual en diferentes niveles de sistema operativo de plataformas.
     */
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtenga la vista de botón del diseño y asigne un clic
        // oyente
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        //val countButton: Button = findViewById(R.id.countup_button)
        //countButton.setOnClickListener { countUp() }

        //val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = "Dice Rolled!"

    }

    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    /*
    private fun rollDice() {
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()

        //val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = randomInt.toString()

        //diceImage = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

    }*/

    /*
        private fun countUp() {
            val resultText: TextView = findViewById(R.id.result_text)

            if (text.toString().isDigitsOnly()) {
                if(text.toInt()<6){
                    resultText.text = (text.toInt()+1).toString()
                }
            } else {
                resultText.text = "1"
            }
        }*/
}