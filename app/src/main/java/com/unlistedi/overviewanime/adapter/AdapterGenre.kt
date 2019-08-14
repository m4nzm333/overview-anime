package com.unlistedi.overviewanime.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unlistedi.overviewanime.R
import kotlinx.android.synthetic.main.anime_genre_row.view.*

class AdapterGenre(private val genre: Array<String>) : RecyclerView.Adapter<AdapterGenre.GenreHolder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): GenreHolder {
        return GenreHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.anime_genre_row, viewGroup, false))
    }
    override fun getItemCount(): Int = genre.size

    override fun onBindViewHolder(holder: GenreHolder, position: Int) {
        holder.bindGenre(genre[position])
    }
    class GenreHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val btnGenre = view.btnGenre
        fun bindGenre(genre: String) {
            btnGenre.text = genre
        }
    }
}
