package com.example.diceroller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

/*berikut merupakan contoh sintax agar si user dapat melakukan proses
* perukaran angka dengan perintah random*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn_roll)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
//    membuat object baru untuk perintah putar 6 x perintah

        val dice = Dice(6)
        val diceRoll = dice.roll()
//        merupakan menampilkan hasil roll ke layar
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    private class Dice(val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}