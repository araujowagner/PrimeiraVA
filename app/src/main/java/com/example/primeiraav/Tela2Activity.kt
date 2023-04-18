package com.example.PrimeiraVA2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.primeiraav.databinding.ActivityTela2Binding
import com.example.primeirava2.databinding.ActivityTela2Binding

class Tela2Activity : AppCompatActivity() {

    private lateinit var binding : ActivityTela2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_tela2)

        binding =  ActivityTela2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val edButton = binding.jabButton

        edButton.setOnClickListener{
            val intent = Intent(this,JabActivity::class.java)
            startActivity(intent)

        }
    }
}