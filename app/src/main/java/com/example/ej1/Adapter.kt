package com.example.ej1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ej1.databinding.ViewPersonaBinding

class Adapter(private val personas : List<Persona> , val listener: (Persona) -> Unit): RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewPersonaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val persona=personas[position]
        holder.bind(persona)
        holder.itemView.setOnClickListener{
            listener(persona)
        }
    }

    override fun getItemCount(): Int = personas.size

    class ViewHolder(private val binding: ViewPersonaBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(persona: Persona) {
            binding.name.text=persona.name
            binding.email.text=persona.email
            binding.tel.text=persona.tel
            binding.pic.setImageResource(persona.pic)
        }

    }


}