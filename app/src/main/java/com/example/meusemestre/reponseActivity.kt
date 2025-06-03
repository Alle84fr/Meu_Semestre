package com.example.meusemestre

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.meusemestre.databinding.ActivityReponseBinding

class reponseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReponseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityReponseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //1° Receber e exibir dados, depois configurar botão para receber dados

        val media = intent.getDoubleExtra("media", 0.0)
        val status = intent.getStringExtra("status")

        //binding.textResultado.text = "Média: %.2f\nStatus: %s".format(media, status)

        val resultadoTextView = findViewById<TextView>(R.id.text_resultado)
        resultadoTextView.text = "Média: %.2f\nStatus: %s".format(media, status)

        //2° botão paginas,metodo 1 botão

        binding.buttonRepoEnviar.setOnClickListener {
            startActivity(Intent(this, ErroPlanoActivity::class.java))
        }
    }
}


