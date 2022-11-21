package com.example.androiddesdecero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editT= findViewById<EditText>(R.id.edit)
        var usuario= findViewById<EditText>(R.id.usuario)
        var boton= findViewById<Button>(R.id.button)
        boton.setOnClickListener {
            Toast.makeText(this, "Hola soy un texto", Toast.LENGTH_LONG).show()
            var intent=Intent(this,Second_activity::class.java)
            var bundle= Bundle()
            intent.putExtra("usuario","daniela")
            startActivity(intent)
        }
        editT.addTextChangedListener {
            if (it?.length?:0 >10){
            editT.setError("no pueden ser mas de 9 caracteres")
        }
        }
    }

}