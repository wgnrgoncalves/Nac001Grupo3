package br.com.fiap.mobile.nac01grupo03.ranking_recycleView

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.mobile.nac01grupo03.R

class RankingViewHolder (val row: View) : RecyclerView.ViewHolder(row) {
    val position: TextView = row.findViewById(R.id.position)
    val player: TextView = row.findViewById(R.id.player)
    val score: TextView = row.findViewById(R.id.score)

}