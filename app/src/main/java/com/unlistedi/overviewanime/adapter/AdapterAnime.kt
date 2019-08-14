import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import com.unlistedi.overviewanime.Anime
import com.unlistedi.overviewanime.AnimeDetailActivity
import com.unlistedi.overviewanime.R
import kotlinx.android.synthetic.main.anime_view_row.view.*
import java.util.*

class AdapterAnime(private val anime: LinkedList<Anime>) : RecyclerView.Adapter<AdapterAnime.AnimeHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): AnimeHolder {
        return AnimeHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.anime_view_row, viewGroup, false))
    }
    override fun getItemCount(): Int = anime.size

    override fun onBindViewHolder(holder: AnimeHolder, position: Int) {
        holder.bindAnime(anime.get(position))
    }
    class AnimeHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvTitleItem = view.tvTitleItem
        private val tvDescription = view.tvDescription
        private val imgItem = view.imgItem
        private var cvAnime = view.cvAnime
        private lateinit var context : Context
        fun bindAnime(anime: Anime) {
            context = super.itemView.context
            cvAnime.setOnClickListener{
                val intent = Intent(this.context, AnimeDetailActivity::class.java)
                intent.putExtra("idAnime", anime.id)
                startActivity(this.context, intent, null)
            }
            tvTitleItem.text = anime.judul
            tvDescription.text = anime.deskripsiKecil
            Picasso.get().load(anime.urlFoto).into(imgItem)
        }
    }
}

