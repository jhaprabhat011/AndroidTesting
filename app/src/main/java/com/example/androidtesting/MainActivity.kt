package com.example.androidtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var nameEditText: EditText
    lateinit var msgTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.nameE)
        msgTextView = findViewById(R.id.tv)
    }

    fun buttonClick(view: View) {
        val name = nameEditText.text.toString()
        if (name.isNotEmpty())
            msgTextView.text = "Hello $name"
        else{
            Toast.makeText(this,"Pls enter name ",
                Toast.LENGTH_LONG).show()
            nameEditText.setError("Name should be entered")
        }
    }
}