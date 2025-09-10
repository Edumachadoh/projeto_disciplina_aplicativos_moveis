package com.example.linkedlncurrculos

import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button


class EditUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_user)

        val nome = intent.getStringExtra("nome_usuario")

        val saudacaoTextView = findViewById<TextView>(R.id.nomeUser)
        saudacaoTextView.text = "$nome"

        val layoutPrincipal = findViewById<View>(R.id.layoutEdit)
        val botaoMudarCor = findViewById<Button>(R.id.salvarEdicaoCor)
        val botaoMudarFonte = findViewById<Button>(R.id.salvarEdicaoFonte)

        // Lista de cores para alternar
        val cores = listOf(
            android.R.color.holo_blue_light,
            android.R.color.holo_green_light,
            android.R.color.holo_orange_light,
            android.R.color.holo_red_light,
            android.R.color.darker_gray
        )
        var corAtual = 0

        botaoMudarCor.setOnClickListener {
            val cor = resources.getColor(cores[corAtual], theme)
            layoutPrincipal.setBackgroundColor(cor)
            corAtual = (corAtual + 1) % cores.size
        }

        // Lista de fontes disponíveis no sistema
        val fontes = listOf(
            Typeface.SANS_SERIF,
            Typeface.SERIF,
            Typeface.MONOSPACE,
            Typeface.DEFAULT_BOLD
        )

        botaoMudarFonte.setOnClickListener {
            val fonteAleatoria = fontes.random()
            saudacaoTextView.typeface = fonteAleatoria
        }
    }

}