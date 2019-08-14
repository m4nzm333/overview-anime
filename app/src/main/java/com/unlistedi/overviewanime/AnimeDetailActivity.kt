package com.unlistedi.overviewanime

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.unlistedi.overviewanime.adapter.AdapterGenre
import com.unlistedi.overviewanime.adapter.AdapterSummary

class AnimeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anime_detail)

        val idAnime : Int = this.intent.getIntExtra("idAnime",  0)
        val animeData : Anime = AnimeDataSet().getAnimeByPosition(idAnime)

        findViewById<TextView>(R.id.tvJudul).text = animeData.judul
        findViewById<TextView>(R.id.tvMangaStatus).text = animeData.statusManga
        findViewById<TextView>(R.id.tvSerialStatus).text = animeData.statusSerial
        findViewById<TextView>(R.id.tvArtist).text = animeData.artist
        findViewById<TextView>(R.id.tvDescription).text = animeData.deskripsi

        Log.println(Log.VERBOSE, "AnimeDataActivity", animeData.genre.toString())

        // Recycler View Genre
        val adapterGenre = AdapterGenre(animeData.genre)
        val adapterSummary = AdapterSummary(animeData.summary)
        val viewManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        var rvGenre : RecyclerView = findViewById(R.id.rvGenre)
        var rvSummary : RecyclerView = findViewById(R.id.rvSumarry)

        rvGenre.apply {
            layoutManager = viewManager
            adapter = adapterGenre
        }
        rvSummary.apply {
            layoutManager = LinearLayoutManager(this@AnimeDetailActivity)
            adapter = adapterSummary
        }

        Picasso.get().load(animeData.urlFoto).into(findViewById<ImageView>(R.id.ivCover))
    }
}
