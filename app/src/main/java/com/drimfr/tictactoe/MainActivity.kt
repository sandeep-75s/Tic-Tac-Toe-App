package com.drimfr.tictactoe

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.drimfr.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var flag = 0
    private var count = 0
    private lateinit var banding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Base_Theme_TicTacToe)
        banding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()

        setContentView(banding.root)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

    }

    @SuppressLint("SetTextI18n")
    fun check (view : View) {
        val currentbtn = view as Button
        if(currentbtn.text=="" && banding.textshow.text!="Winner is X" && banding.textshow.text!="Winner is O"){

            count++
            if(flag==0){
                currentbtn.text = "X"
                flag = 1
                banding.textshow.text = "Now O turn"

            }
            else{
                currentbtn.text = "O"
                flag = 0
                banding.textshow.text = "Now X turn"
            }
            if(banding.btn1.text.toString()==banding.btn2.text.toString() && banding.btn2.text.toString()==banding.btn3.text.toString() && banding.btn3.text.toString()!=""){
                banding.textshow.text = "Winner is ${banding.btn1.text}"
            }
            else if(banding.btn4.text.toString()==banding.btn5.text.toString() && banding.btn5.text.toString()==banding.btn6.text.toString() && banding.btn6.text.toString()!=""){
                banding.textshow.text = "Winner is ${banding.btn4.text}"
            }
            else if(banding.btn7.text.toString()==banding.btn8.text.toString() && banding.btn8.text.toString()==banding.btn9.text.toString() && banding.btn9.text.toString()!=""){
                banding.textshow.text = "Winner is ${banding.btn7.text}"
            }
            else if(banding.btn1.text.toString()==banding.btn4.text.toString() && banding.btn4.text.toString()==banding.btn7.text.toString() && banding.btn7.text.toString()!=""){
                banding.textshow.text = "Winner is ${banding.btn1.text}"
            }
            else if(banding.btn2.text.toString()==banding.btn5.text.toString() && banding.btn5.text.toString()==banding.btn8.text.toString() && banding.btn8.text.toString()!=""){
                banding.textshow.text = "Winner is ${banding.btn2.text}"
            }
            else if(banding.btn3.text.toString()==banding.btn6.text.toString() && banding.btn6.text.toString()==banding.btn9.text.toString() && banding.btn9.text.toString()!=""){
                banding.textshow.text = "Winner is ${banding.btn3.text}"
            }
            else if(banding.btn1.text.toString()==banding.btn5.text.toString() && banding.btn5.text.toString()==banding.btn9.text.toString() && banding.btn9.text.toString()!=""){
                banding.textshow.text = "Winner is ${banding.btn1.text}"
            }
            else if(banding.btn3.text.toString()==banding.btn5.text.toString() && banding.btn5.text.toString()==banding.btn7.text.toString() && banding.btn7.text.toString()!=""){
                banding.textshow.text = "Winner is ${banding.btn3.text}"
            }
            else if (count==9){
                banding.textshow.text = "Match Draw"
            }
        }


    }



    @SuppressLint("SetTextI18n")
    fun restart(view: View){
        banding.btn1.text = ""
        banding.btn2.text = ""
        banding.btn3.text = ""
        banding.btn4.text = ""
        banding.btn5.text = ""
        banding.btn6.text = ""
        banding.btn7.text = ""
        banding.btn8.text = ""
        banding.btn9.text = ""
        flag = 0
        count = 0
        banding.textshow.text = "Now X turn"

    }
}