package com.example.linkedlncurrculos

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.linkedlncurrculos.databinding.ActivityHomeBinding

class EditUserActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            setContentView(R.layout.activity_edit_user)

            val nome = intent.getStringExtra("nome_usuario")

            val saudacaoTextView = findViewById<TextView>(R.id.nomeUser) // ou o ID que você quiser
            saudacaoTextView.text = "$nome"
        }
}