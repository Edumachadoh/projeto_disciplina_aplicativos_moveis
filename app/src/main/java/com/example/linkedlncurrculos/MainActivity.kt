package com.example.linkedlncurrculos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.linkedlncurrculos.databinding.ActivityHomeBinding
import com.example.linkedlncurrculos.databinding.ActivityMainBinding
import com.example.linkedlncurrculos.ui.theme.LinkedlnCurrículosTheme

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding // conecta o front com o back

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


    }
}

