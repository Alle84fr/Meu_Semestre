package com.example.meusemestre

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FiltersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filters)

        val ap1EditText = findViewById<EditText>(R.id.caixaAp1)
        val ap2EditText = findViewById<EditText>(R.id.caixaAp2)
        val enviarButton = findViewById<Button>(R.id.button01)

        enviarButton.setOnClickListener {
            val nota1 = ap1EditText.text.toString().toDoubleOrNull()
            val nota2 = ap2EditText.text.toString().toDoubleOrNull()

            if (nota1 != null && nota2 != null) {
                val media = (nota1 + nota2) / 2
                val status = if (media >= 6.0) "Aprovado" else "Reprovado"

                // Intent para abrir a próxima tela
                val intent = Intent(this, reponseActivity::class.java)
                intent.putExtra("media", media)
                intent.putExtra("status", status)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Digite notas válidas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
