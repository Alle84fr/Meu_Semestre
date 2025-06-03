package com.example.meusemestre

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meusemestre.databinding.ActivityErroPlanoBinding
import com.example.meusemestre.databinding.ActivityFinalBinding

class ErroPlanoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityErroPlanoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityErroPlanoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonErroplanVoltar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}