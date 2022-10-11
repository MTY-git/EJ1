package com.example.ej1

import android.content.Intent
import android.net.Uri
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

        val binding = inflate(layoutInflater).apply {
            setContentView(root)

            val persona = intent.getParcelableExtra<Persona>(EXTRA_PERSONA)

            if(persona!=null){
                detailName.text=persona.name
                detailImagen.setImageResource(persona.pic)
                llamar.setOnClickListener{
                    val intent = Intent(Intent.ACTION_DIAL)
                        intent.data = Uri.parse("tel:${persona.tel}")
                    if (intent.resolveActivity(packageManager) != null) {
                        startActivity(intent)
                    }
                }
                enviarEmail.setOnClickListener {
                    val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:${persona.email}"))
                    if (intent.resolveActivity(packageManager) != null) {
                        startActivity(intent)
                    }
                }
            }
        }
    }
}