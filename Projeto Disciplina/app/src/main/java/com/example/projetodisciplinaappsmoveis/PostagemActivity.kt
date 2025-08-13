package com.example.projetodisciplinaappsmoveis

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PostagemActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_postagem)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val titulo = findViewById<EditText>(R.id.inputTitulo)
        val data = findViewById<EditText>(R.id.inputData)
        val descricao = findViewById<EditText>(R.id.inputDescricao)
        val modelo = findViewById<EditText>(R.id.inputModelo)
        val ano = findViewById<EditText>(R.id.inputAno)
        val cor = findViewById<EditText>(R.id.inputCor)
        val btnPostar = findViewById<Button>(R.id.btnPostar)

        btnPostar.setOnClickListener {
            val mensagem = """
                🚗 Postagem criada:
                Título: ${titulo.text}
                Data: ${data.text}
                Descrição: ${descricao.text}
                Modelo: ${modelo.text}
                Ano: ${ano.text}
                Cor: ${cor.text}
            """.trimIndent()

            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }
    }
}