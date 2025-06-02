package com.example.meusemestre

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class reponseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reponse)

        val media = intent.getDoubleExtra("media", 0.0)
        val status = intent.getStringExtra("status")

        val resultadoTextView = findViewById<TextView>(R.id.text_resultado)
        resultadoTextView.text = "Média: %.2f\nStatus: %s".format(media, status)
    }
}
