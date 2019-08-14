package com.unlistedi.overviewanime

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val ivProfil : ImageView = findViewById(R.id.ivProfilku)
        Picasso.get().load("https://www.dicoding.com/images/small/avatar/20190803020857b9fc967e78a69af7f7062a767684d42b.jpg").into(ivProfil)
    }
}
