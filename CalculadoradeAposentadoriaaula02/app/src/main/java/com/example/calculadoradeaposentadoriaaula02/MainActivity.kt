package com.example.calculadoradeaposentadoriaaula02 //essa linha não pode ser apagada!

import android.os.Bundle //essa biblioteca serve para construir a aplicação, tem que ficar, NÃO PRECISA MEXER
import androidx.appcompat.app.AppCompatActivity //para poder rodar o app
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.ArrayAdapter
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    private lateinit var spinnerSexo: Spinner
    private lateinit var editText: EditText
    private lateinit var buttonCalcular: Button


    override fun onCreate(savedInstanceState: Bundle?) { //não mexer nisso, já é um padrão
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //linkar com o que fizemos na parte do layout

        spinnerSexo = findViewById(R.id.spinner_sexo) //encontre o componente por ID
        editText = findViewById(R.id.editText_idade)
        buttonCalcular = findViewById(R.id.button_calcular)

        //CONFIGURAR O SPINNER
        //Primeiro declara as variaveis
        val opcoesSexo = arrayOf(
            "Masculino",
            "Feminino"
        ) //aqui pode ser colocado quantos opcoes forem necessarias
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            opcoesSexo
        ) //arrayadapter é um objeto que
        //o R é de res, esse simple_spinner_item
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerSexo.adapter = adapter // linka tudo para aplicar as configuraçoes no spinner

        //CONFIGURAR O CLICK DO BOTÃO
        buttonCalcular.setOnClickListener() { //clicklistener é um objeto atrelado ao meu componente e fica quieto, esperando quando clica para disparar alguma ação
            calcularAposentadoria()
        }
    }

        private fun calcularAposentadoria(){
            val idade = editText.text.toString().toIntOrNull()
            val sexo = spinnerSexo.selectedItem.toString() //selectItem seleciona as opçoes que foram dadas, que no caso é masc e fem

            if(idade != null) {
                val idadeAposentadoria =
                    if (sexo == "Masculino") 65 else 62             //se o sexo for masculino vai entender que é 65 se for feminino entra no 62
                val anosRestantes = idadeAposentadoria - idade

                if(anosRestantes>0){
                    Toast.makeText(this, "Faltam $anosRestantes anos para a sua aposentadoria",Toast.LENGTH_LONG).show() //pop up que vai aparecer
                    //lenght long mostra que é um pop up de comprimento longo e o .show é para aparecer em tela
                }else{
                    Toast.makeText(this, "Você já pode se aposentar", Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "Por favor, insira uma idade válida!", Toast.LENGTH_LONG).show()
            }
        }

    }
