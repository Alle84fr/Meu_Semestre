package com.example.meusemestre

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meusemestre.databinding.ActivityFinalBinding
import com.example.meusemestre.databinding.ActivityPlanoBinding

class FinalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFinalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnFinVolt.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}

