package com.example.ej1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ej1.databinding.ActivityMainBinding
import com.example.ej1.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = inflate(layoutInflater).apply {
            setContentView(root)

            recycler.adapter=Adapter(personas) { persona ->
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_PERSONA, persona)
                startActivity(intent)
            }

        }
    }

    private val personas=
        listOf(
            Persona("Pedro Jurado","987123456","pjurado@gmail.com", R.drawable.userpng),
            Persona("Óscar Sainz","653289730","OscarSainz@gmail.com", R.drawable.userpng),
            Persona("Pepe Pérez","936193626","PepePerez@gmail.com", R.drawable.userpng),
            Persona("Antonio Gómex","68391442","AntonioGomex@gmail.com", R.drawable.userpng),
            Persona("Fulanito de Tal","11111111","prueba.com", R.drawable.userpng),
            Persona("Fulanito de Tal","11111111","prueba.com", R.drawable.userpng),
            Persona("Fulanito de Tal","11111111","prueba.com", R.drawable.userpng),
            Persona("Fulanito de Tal","11111111","prueba.com", R.drawable.userpng),
            Persona("Fulanito de Tal","11111111","prueba.com", R.drawable.userpng),
            Persona("Fulanito de Tal","11111111","prueba.com", R.drawable.userpng),
            Persona("Fulanito de Tal","11111111","prueba.com", R.drawable.userpng),
            Persona("Fulanito de Tal","11111111","prueba.com", R.drawable.userpng),
        )//FinishList
}