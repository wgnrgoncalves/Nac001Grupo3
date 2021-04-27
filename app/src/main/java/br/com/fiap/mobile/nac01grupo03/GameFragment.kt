package br.com.fiap.mobile.nac01grupo03
import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import br.com.fiap.mobile.nac01grupo03.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    val args: GameFragmentArgs by navArgs()

    private lateinit var bindings: FragmentGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        bindings = DataBindingUtil.inflate(inflater, R.layout.fragment_game, container, false)
        return bindings.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindings.playerScore.text = args.playerName
        bindings.playerChooseText = getString(R.string.player_choose_placeholder)

        bindings.pedra.setOnClickListener {
            bindings.playerChooseText = getString(R.string.pedra)
        }
        bindings.papel.setOnClickListener {
            bindings.playerChooseText = getString(R.string.papel)
        }
        bindings.tesoura.setOnClickListener {
            bindings.playerChooseText = getString(R.string.tesoura)
        }
    }
}