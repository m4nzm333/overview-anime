package com.unlistedi.overviewanime

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import AdapterAnime
import android.content.Intent
import android.support.v4.content.ContextCompat
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myDataSet : LinkedList<Anime>  = AnimeDataSet().getList()

        val rvMain :  RecyclerView =  findViewById(R.id.rvAnime)

        // Cara Pake Adapter
        val animeAdapter = AdapterAnime(myDataSet)
        viewManager = LinearLayoutManager(this)
        rvMain.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = animeAdapter
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this, AboutActivity::class.java)
        ContextCompat.startActivity(this, intent, null)

        return super.onOptionsItemSelected(item)
    }
}
