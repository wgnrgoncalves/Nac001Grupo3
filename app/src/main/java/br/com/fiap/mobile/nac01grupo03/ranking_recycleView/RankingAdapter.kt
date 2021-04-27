package br.com.fiap.mobile.nac01grupo03.ranking_recycleView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.mobile.nac01grupo03.data.RankingItem
import br.com.fiap.mobile.nac01grupo03.R

class RankingAdapter (val data: ArrayList<RankingItem>) : RecyclerView.Adapter<RankingViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RankingViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.ranking_item_view, parent, false)
        return RankingViewHolder(layout)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: RankingViewHolder, position: Int) {
        holder.position.text = "${data[position].position.toString()}°"
        holder.player.text = data[position].player
        holder.score.text = "${data[position].score} pts"
    }
}