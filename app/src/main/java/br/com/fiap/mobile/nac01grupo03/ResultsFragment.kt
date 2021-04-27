package br.com.fiap.mobile.nac01grupo03

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.mobile.nac01grupo03.data.ASSharedPreferences
import br.com.fiap.mobile.nac01grupo03.data.RankingItem
import br.com.fiap.mobile.nac01grupo03.ranking_recycleView.RankingAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ResultsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultsFragment : Fragment() {
    private lateinit var sharedPrefs: ASSharedPreferences

    override fun onAttach(context: Context) {
        super.onAttach(context)
        sharedPrefs = ASSharedPreferences(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_results, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rv: RecyclerView = view.findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(activity)
        rv.adapter = RankingAdapter(MOCK)
    }

}

val MOCK = arrayListOf<RankingItem>(
    RankingItem("João", 1212, 1),
    RankingItem("Maria", 1111, 2),
    RankingItem("João", 735, 3),
    RankingItem("Chuck", 722, 4),
    RankingItem("Peter Pan", 716, 5),
    RankingItem("Peter Pan", 544, 6),
    RankingItem("Sofia", 543, 7),
    RankingItem("Alberto", 541, 8),
    RankingItem("Bart", 212, 9),
    RankingItem("Homer", 71, 10)
)