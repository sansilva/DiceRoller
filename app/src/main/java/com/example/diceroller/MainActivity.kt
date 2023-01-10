package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUp: Button = findViewById(R.id.count_up_button)

        rollButton.setOnClickListener { rollDice() }
        countUp.setOnClickListener{ countUp() }
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = randomInt.toString()

//        Toast.makeText(this, "Botão Clicado!",
//            Toast.LENGTH_SHORT).show()
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        val maisUm = resultText.text.toString()

        if(maisUm.toInt() < 6){
            val resultado = maisUm.toInt() + 1
            resultText.text = resultado.toString()
        }else

        Toast.makeText(this, "Número 6... não faça nada",
          Toast.LENGTH_SHORT).show()
    }

    // Abaixo uma outra solução para Função countUp()

//    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        // If text is the default "Hello World!" set that text to 1.
//        if (resultText.text == "Hello World!") {
//            resultText.text = "1"
//        } else {
//            // Otherwise, increment the number up to 6.
//            // The text value in resultText.text is an instance of the CharSequence class;
//            // it needs to be converted to a String object before it can be converted to an int.
//            var resultInt = resultText.text.toString().toInt()
//
//            if (resultInt < 6) {
//                resultInt++
//                resultText.text = resultInt.toString()
//            }
//        }
//    }
}