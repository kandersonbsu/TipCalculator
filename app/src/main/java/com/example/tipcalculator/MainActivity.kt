package com.example.tipcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tempText:String
        var tempDouble:Double

        //Button Declarations
        val one:Button = findViewById(R.id.one)
        val two:Button = findViewById(R.id.two)
        val three:Button = findViewById(R.id.three)
        val four:Button = findViewById(R.id.four)
        val five:Button = findViewById(R.id.five)
        val six:Button = findViewById(R.id.six)
        val seven:Button = findViewById(R.id.seven)
        val eight:Button = findViewById(R.id.eight)
        val nine:Button = findViewById(R.id.nine)
        val zero:Button = findViewById(R.id.zero)
        val dot:Button = findViewById(R.id.dot)
        val del:Button = findViewById(R.id.del)

        val tenPercent:Button = findViewById(R.id.tenpercent)
        val fifteenPercent:Button = findViewById(R.id.fifteenpercent)
        val twentyPercent:Button = findViewById(R.id.twentypercent)
        val twentyfivePercent:Button = findViewById(R.id.twentyfivepercent)

        //TextView Declarations
        val subtotal:TextView = findViewById(R.id.subtotal)
        val totalwithtip:TextView = findViewById(R.id.totalwithtip)

        //Onclick Listeners
        one.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText += "1"
            subtotal.text = tempText
        }
        two.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText += "2"
            subtotal.text = tempText
        }
        three.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText += "3"
            subtotal.text = tempText
        }
        four.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText += "4"
            subtotal.text = tempText
        }
        five.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText += "5"
            subtotal.text = tempText
        }
        six.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText += "6"
            subtotal.text = tempText
        }
        seven.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText += "7"
            subtotal.text = tempText
        }
        eight.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText += "8"
            subtotal.text = tempText
        }
        nine.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText += "9"
            subtotal.text = tempText
        }
        zero.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText += "0"
            subtotal.text = tempText
        }
        dot.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText += "."
            subtotal.text = tempText
        }
        del.setOnClickListener {
            tempText = subtotal.text.toString()
            tempText = tempText.dropLast(1)
            subtotal.text = tempText
        }

        tenPercent.setOnClickListener {
            tempText = subtotal.text.toString()
            if(tempText == "")
                return@setOnClickListener
            tempDouble = tempText.toDouble()
            tempDouble += tempDouble * .10
            totalwithtip.text = dollarString(tempDouble)
        }

        fifteenPercent.setOnClickListener {
            tempText = subtotal.text.toString()
            if(tempText == "")
                return@setOnClickListener
            tempDouble = tempText.toDouble()
            tempDouble += tempDouble * .15
            totalwithtip.text = dollarString(tempDouble)
        }
        twentyPercent.setOnClickListener {
            tempText = subtotal.text.toString()
            if(tempText == "")
                return@setOnClickListener
            tempDouble = tempText.toDouble()
            tempDouble += tempDouble * .20
            totalwithtip.text = dollarString(tempDouble)
        }

        twentyfivePercent.setOnClickListener {
            tempText = subtotal.text.toString()
            if(tempText == "")
                return@setOnClickListener
            tempDouble = tempText.toDouble()
            tempDouble += tempDouble * .25
            totalwithtip.text = dollarString(tempDouble)
        }
    }
}

fun dollarString(double:Double):String{
    return "$" + "%.2f".format(double)
}
