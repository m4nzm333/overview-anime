package com.unlistedi.overviewanime.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unlistedi.overviewanime.R
import kotlinx.android.synthetic.main.anime_genre_row.view.*
import kotlinx.android.synthetic.main.anime_summary_row.view.*

class AdapterSummary(private val summary: Array<String>) : RecyclerView.Adapter<AdapterSummary.SummaryHolder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): SummaryHolder {
        return SummaryHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.anime_summary_row, viewGroup, false))
    }
    override fun getItemCount(): Int = summary.size

    override fun onBindViewHolder(holder: SummaryHolder, position: Int) {
        holder.bindGenre(summary[position])
    }
    class SummaryHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvSummary = view.tvSummary
        fun bindGenre(summary: String) {
            tvSummary.text = summary
        }
    }
}
