package com.example.meusemestre

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meusemestre.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var clickListener = View.OnClickListener { view -> when (view.id) {
            R.id.btn_main_cadastrar -> startActivity(Intent(this, CadastroActivity::class.java))
            R.id.btn_main_final -> startActivity(Intent(this, FinalActivity::class.java))
            R.id.btn_main_plano -> startActivity(Intent(this, PlanoActivity::class.java))
            R.id.btn_main_login -> startActivity(Intent(this, FiltersActivity::class.java))
        }
        }
        binding.btnMainCadastrar.setOnClickListener(clickListener)
        binding.btnMainFinal.setOnClickListener(clickListener)
        binding.btnMainPlano.setOnClickListener(clickListener)
        binding.btnMainLogin.setOnClickListener(clickListener)

    }

}
