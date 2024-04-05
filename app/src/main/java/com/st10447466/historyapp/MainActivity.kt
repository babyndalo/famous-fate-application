package com.st10447466.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var etPersonAge : EditText? = null
    private var tvDisplayAnswer : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etPersonAge = findViewById(R.id.etAge)
        tvDisplayAnswer = findViewById(R.id.tvDisplay)

        val btnGeneratreHistory = findViewById<Button>(R.id.btnGenerate)
        btnGeneratreHistory.setOnClickListener{
            generateHistory()
        }

        val btnClearScreen = findViewById<Button>(R.id.btnClearScreen)
        btnClearScreen.setOnClickListener{
            clearTheScreen()
        }
    }

    private fun clearTheScreen() {
        // clear the etPersonAge box
        // clear tvDisplay

        etPersonAge?.text = null
        tvDisplayAnswer?.text = ""
    }

    private fun generateHistory() {
        // read the age
        // validate the age (error?)

        //find the age in the data set
        // display answer or display no answer

        var intAge : Int = 0
        var strOutput = ""

        val strEnteredValue = etPersonAge?.text.toString().trim()

        if (strEnteredValue.isEmpty()){
            etPersonAge?.error = "Enter a number"
            return
        }
        try{
            intAge = strEnteredValue.toInt()
            if (intAge < 20 || intAge > 100){
                //tvDisplayAnswer?.text = "Error - Invalid Age"
                etPersonAge?.error = "Invalid Age"
            }else{
                when (intAge) {
                    31 -> strOutput = "Eazy-E was a rapper and record producer. He was 31 years old when he died in 1995 March 26."

                    40 -> strOutput = "Paul Walker,Best Known for His Role as 'Brian O'Conner' in the 'Fast & Furious' Franchise.He was 40 years old when he died in November 30, 2013."

                    50 -> strOutput = "Leif Erikson,First European to reach North America.he was 50 years old when He died in 1020 AD"

                    60 -> strOutput = "Carrie Fisher was an American actress best known for playing Princess Leia in the Star Wars films.She was 60 years old when he died in December 27, 2016."

                    70 -> strOutput = "Nina Simone,One of the Most Influential Musical Artists of the 20th Century.She was 70 years old when she died in April 21, 2003."

                    80 -> strOutput = "Marlon Brando,he is One of the Most Influential Actors of the 20th Century.He was 80 years old when he died in July 1, 2004."

                    90 -> strOutput = "Colonel Sanders,Founder of the Fast Food Chicken Restaurant ‘Kentucky Fried Chicken’ (KFC).He was 90 years old when he died in December 16, 1980."

                    51 -> strOutput = "Gianni Versace,Italian Fashion Designer, Businessman and Founder of ‘Versace’.He was 51 years old when he died in July 15, 1997."

                    91 -> strOutput = "John Adams was a statesman, attorney, and diplomat who served as the second president of the United States.He was 91 years old when he died in July 4, 1826."

                    81 -> strOutput = "Wyatt Earp is most known for his role in one of the most famous gunfights in the American West history - the Gunfight at O.K. Corral against a group of cowboys.He was 81 years old when he died in January 13, 1929."

                    else-> {
                        strOutput = "Nothing in data set"

                    }
                }
            }
            tvDisplayAnswer?.text =strOutput
        } catch (e: NumberFormatException){
            etPersonAge?.error = "Enter a valid number"
        }

        /*
        if (intAge < 20 || intAge > 100){
            //tvDisplayAnswer?.text = "Error - Invalid Age"
        } esle {
            when (intAge) {
                21 -> strOutput = "s21"
                23 -> strOutput = "s23"
                else -> {
                    strOutput = "Nothing in data set"
                  {
               {
            {
            tvDisplayAnswer?.text = strOutput
         */
    }
    private fun clear(){

        etPersonAge?.text = null
        tvDisplayAnswer?.text = ""
    }
}