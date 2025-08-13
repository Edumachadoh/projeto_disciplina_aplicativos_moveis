package com.example.projetodisciplinaappsmoveis

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadastro_usuario)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginRoot)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nome = findViewById<EditText>(R.id.inputNome)
        val email = findViewById<EditText>(R.id.inputEmail)
        val senha = findViewById<EditText>(R.id.inputSenha)
        val confirmacaoSenha = findViewById<EditText>(R.id.inputConfirmacaoSenha)
        val btnCadastrar = findViewById<Button>(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            val nomeText = nome.text.toString()
            val emailText = email.text.toString()
            val senhaText = senha.text.toString()
            val confirmacaoText = confirmacaoSenha.text.toString()

            if (nomeText.isBlank() || emailText.isBlank() || senhaText.isBlank() || confirmacaoText.isBlank()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else if (senhaText != confirmacaoText) {
                Toast.makeText(this, "As senhas não coincidem", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show()
                // Aqui você pode salvar os dados ou navegar para outra tela
            }
        }
    }
}