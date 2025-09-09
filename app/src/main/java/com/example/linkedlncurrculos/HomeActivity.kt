package com.example.linkedlncurrculos

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.linkedlncurrculos.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding // conecta o front com o back

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.arrowHomeButtom.setOnClickListener {
            // Captura o texto digitado no campo de nome
            val nomeDigitado = binding.inputNome.text.toString()

            // Verifica se o nome não está vazio
            if (nomeDigitado.isNotBlank()) {
                // Cria a intent e envia o nome como extra
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("nome_usuario", nomeDigitado)
                startActivity(intent)
            } else {
                // Exibe uma mensagem pedindo para preencher o nome
                Toast.makeText(this, "Por favor, digite seu nome!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}