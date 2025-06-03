package com.example.meusemestre

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meusemestre.databinding.ActivityCadastroBinding
import com.example.meusemestre.databinding.ActivityPlanoBinding

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //diversos botões

        var clickListener = View.OnClickListener{view -> when (view.id){
            R.id.btn_cad_voltar -> startActivity(Intent(this, MainActivity::class.java))
            R.id.btn_cad_cadastrar -> startActivity(Intent(this, ErroPlanoActivity::class.java))
        }
        }
        binding.btnCadVoltar.setOnClickListener(clickListener)
        binding.btnCadCadastrar.setOnClickListener(clickListener)


    }
}