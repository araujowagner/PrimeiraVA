package com.example.PrimeiraVA2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.primeirava2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edButton = binding.btLogin

        edButton.setOnClickListener{
            val intent = Intent(this,Tela2Activity::class.java)
            startActivity(intent)

        }
    }
}