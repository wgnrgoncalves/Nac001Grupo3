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
import br.com.fiap.mobile.nac01grupo03.R.drawable.*

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

        val images: MutableList<Int> =
                mutableListOf(camel, coala, fox, lion, monkey, wolf, camel, coala, fox, lion, monkey, wolf)

        val buttons = arrayOf(bindings.button1, bindings.button2, bindings.button3, bindings.button4, bindings.button5, bindings.button6, bindings.button7, bindings.button8,
                bindings.button9, bindings.button10, bindings.button11, bindings.button12)

        val cardBack = code
        var clicked = 0
        var turnOver = false
        var lastClicked = -1

        images.shuffle()
        for(i in 0..11){
            buttons[i].setBackgroundResource(cardBack)
            buttons[i].setTag("cardBack")
            //buttons[i].textSize = 0.0F
            buttons[i].setOnClickListener {
                if (buttons[i].tag == "cardBack" && !turnOver) {
                    buttons[i].setBackgroundResource(images[i])
                    buttons[i].setTag(images[i])
                    if (clicked == 0) {
                        lastClicked = i
                    }
                    clicked++
                } else if (buttons[i].tag.toString() !in "cardBack") {
                    buttons[i].setBackgroundResource(cardBack)
                    buttons[i].tag = "cardBack"
                    clicked--
                }

                if (clicked == 2) {
                    turnOver = true
                    if (buttons[i].tag.toString() == buttons[lastClicked].tag.toString()) {
                        buttons[i].isClickable = false
                        buttons[lastClicked].isClickable = false
                        turnOver = false
                        clicked = 0
                    }
                } else if (clicked == 0) {
                    turnOver = false
                }
            }
        }


        return bindings.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //bindings.playerScore.text = args.playerName


    }
}