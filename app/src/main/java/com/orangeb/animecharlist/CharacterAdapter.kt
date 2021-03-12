package com.orangeb.animecharlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CharacterAdapter(private val character:List<Character>): RecyclerView.Adapter<CharacterAdapter.CharacterHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CharacterHolder(layoutInflater.inflate(R.layout.item_character, parent, false))
    }

    override fun getItemCount(): Int {
        return character.size
    }

    override fun onBindViewHolder(holder: CharacterHolder, position: Int) {
        holder.render(character[position])
    }

    class CharacterHolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(character: Character){
            view.findViewById<TextView>(R.id.tvName).text = character.charName
            view.findViewById<TextView>(R.id.tvAnime).text = character.anime
            view.findViewById<TextView>(R.id.tvPublisher).text = character.publisher
            Picasso.get().load(character.image).into(view.findViewById<ImageView>(R.id.ivCharacter))
            view.setOnClickListener{ Toast.makeText(view.context, "Has seleccionado a ${character.charName}", Toast.LENGTH_SHORT).show() }
        }
    }
}