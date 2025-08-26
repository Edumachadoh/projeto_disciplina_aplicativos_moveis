package com.example.linkedlncurrculos

import android.content.Intent
import android.os.Bundle
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

        binding.arrowHomeButtom.setOnClickListener { // criar evento no botão arrow, que quando clicado leva até a main activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}