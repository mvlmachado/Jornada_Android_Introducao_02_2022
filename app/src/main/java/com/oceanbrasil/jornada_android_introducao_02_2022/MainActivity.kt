package com.oceanbrasil.jornada_android_introducao_02_2022

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adicionar um Listener ao botão
        // 1 - Pegar o botão
        // 2 - Adicionar o listener

        val button = findViewById<Button>(R.id.btEnviar)
        val textView = findViewById<TextView>(R.id.tvResultado)
        val editTextView = findViewById<EditText>(R.id.etName)

        // Dentro das chaves, o código que escrevemos será executado apenas
        // quando o botão for clicado
        button.setOnClickListener {
            // Código para executar quando o botão for clicado
            if(editTextView.text.isNullOrBlank()) {
                editTextView.error = "Mensagem de erro!"
            } else {
                textView.text = editTextView.text
            }
        }
    }
}