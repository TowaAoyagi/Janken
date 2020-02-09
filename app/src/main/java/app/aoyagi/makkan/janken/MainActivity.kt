package app.aoyagi.makkan.janken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goo(view: View?){
        player.text = "あなたの手はグーです"

        when (Random().nextInt(3)){
            0 -> {
                cpu.text = "相手の手はグーです"
                result.text = "引き分けです"
                result.setTextColor(Color.BLACK)

            }

            1 -> {
                cpu.text = "相手の手はチョキです"
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.RED)
            }

            2 -> {
                cpu.text = "相手の手はパーです"
                result.text = "あなたの負けです"
                result.setTextColor(Color.BLACK)

            }
        }
    }
    fun choki(view: View?){
        player.text = "あなたの手はチョキです"

        when (Random().nextInt(3)){
            0 -> {
                cpu.text = "相手の手はチョキです"
                result.text = "引き分けです"
                result.setTextColor(Color.BLACK)
            }

            1 -> {
                cpu.text = "相手の手はパーです"
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.RED)
            }

            2 -> {
                cpu.text = "相手の手はグーです"
                result.text = "あなたの負けです"
                result.setTextColor(Color.BLACK)
            }
        }
    }
    fun paa(view: View?){
        player.text = "あなたの手はパーです"

        when (Random().nextInt(3)){
            0 -> {
                cpu.text = "相手の手はパーです"
                result.text = "引き分けです"
                result.setTextColor(Color.BLACK)

            }

            1 -> {
                cpu.text = "相手の手はグーです"
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.RED)
            }

            2 -> {
                cpu.text = "相手の手はチョキです"
                result.text = "あなたの負けです"
                result.setTextColor(Color.BLACK)

            }
        }
    }
}
