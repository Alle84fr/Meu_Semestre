package com.example.meusemestre

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meusemestre.databinding.ActivityPlanoBinding

class PlanoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlanoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPlanoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //diversos botões

        var clickListener = View.OnClickListener{view -> when (view.id){
            R.id.btn_plan_volt -> startActivity(Intent(this, MainActivity::class.java))
            R.id.btn_plan_assin -> startActivity(Intent(this, ErroPlanoActivity::class.java))
        }
        }
        binding.btnPlanVolt.setOnClickListener(clickListener)
        binding.btnPlanAssin.setOnClickListener(clickListener)


    }
}