package com.example.codelab21

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private val LOG_TAG = this.toString().split(".")[3]

    @SuppressLint("MissingInflatedId", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "---------")
        Log.d(LOG_TAG, "onCreate")

        val message = intent.getStringExtra("comida")
        val txtMsg: TextView = findViewById(R.id.text_message_reply)
        Log.d("Comida: ", message.toString())
        txtMsg.text=message
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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val mReplyHeadTextView: TextView = findViewById(R.id.text_header_reply);
        val txtMsg: TextView = findViewById(R.id.text_message_reply);
        if (mReplyHeadTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text",
                txtMsg.getText().toString());
        }
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