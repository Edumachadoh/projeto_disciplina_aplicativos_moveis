package com.example.linkedlncurrculos

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.linkedlncurrculos.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializa o binding corretamente
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Recupera o nome enviado pela Intent
        val nome = intent.getStringExtra("nome_usuario")

        // Exibe o nome no TextView
        binding.nameUserInput.text = nome ?: "Usuário"

        // Evento do botão para editar o nome
        binding.editUserButton.setOnClickListener {
            val nomeAtual = binding.nameUserInput.text.toString()

            if (nomeAtual.isNotBlank()) {
                val intent = Intent(this, EditUserActivity::class.java)
                intent.putExtra("nome_usuario", nomeAtual)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Erro ao abrir edição de usuário", Toast.LENGTH_SHORT).show()
            }
        }
    }
}