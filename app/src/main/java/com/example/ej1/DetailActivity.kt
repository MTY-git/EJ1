package com.example.ej1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ej1.databinding.ActivityDetailBinding.inflate


class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_PERSONA = "persona"
    }

    private lateinit var binding: DetailActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = inflate(layoutInflater)
        setContentView(binding.root)

        val persona = intent.getParcelableExtra<Persona>(EXTRA_PERSONA)

        if(persona!=null){
            binding.detailName.text=persona.name
            binding.detailImagen.setImageResource(persona.pic)
        }
    }
}