package com.example.codelab23

import android.annotation.SuppressLint
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.app.ShareCompat

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        val uri: Uri? = intent.data
        if(uri != null){
            val uri_string: String = "RUI: " + uri.toString()
            val txtView: TextView = findViewById(R.id.txtUri)
            txtView.text = uri_string
        }
        */
    }

    @SuppressLint("QueryPermissionsNeeded")
    fun openWebsite(view: View) {
        val etxtWeb: EditText = findViewById(R.id.etxtWeb)
        val url = etxtWeb.text.toString()
        val webpage:Uri = Uri.parse("http://" + url)
        val intent = Intent(ACTION_VIEW, webpage)

        Log.d("WEB", "Clicked :(")
        if(intent.resolveActivity(packageManager) != null){
            Log.d("WEB", "Furula el intent de la web :)")
            startActivity(intent)
        }else{
            Log.d("WEB", "No furula el intent de la web :(")
        }
    }

    @SuppressLint("QueryPermissionsNeeded")
    fun openLocation(view: View) {
        val etxtLocation: EditText = findViewById(R.id.etxtLocation)
        val location = etxtLocation.text.toString()
        val Location: Uri = Uri.parse("geo:0,0?q" + location)
        val intent = Intent(ACTION_VIEW, Location)
        if(intent.resolveActivity(packageManager) != null){
            Log.d("LOCATION", "Furula el intent de la localización :) -> " + Location)
            startActivity(intent)
        }else{
            Log.d("LOCATION", "No furula el intent de la localización :( -> " + Location)
        }
    }

    fun openText(view: View) {
        val etxtText: EditText = findViewById(R.id.etxtText)
        val texto = etxtText.text.toString()
        val type = "text/plain"
        ShareCompat.IntentBuilder
            .from(this)
            .setType(type)
            .setChooserTitle(R.string.share_text_with)
            .setText(texto)
            .startChooser()
        Log.d("MESSAGE", "Furula el envío de mensajes :)")
    }
}