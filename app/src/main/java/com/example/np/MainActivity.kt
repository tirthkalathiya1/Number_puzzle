package com.example.np

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn0: Button
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btn10:Button

    var ab = ArrayList<Button>()
    var c=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn10 = findViewById(R.id.btn10)

        ab.add(0,btn0)
        ab.add(1,btn1)
        ab.add(2,btn2)
        ab.add(3,btn3)
        ab.add(4,btn4)
        ab.add(5,btn5)
        ab.add(6,btn6)
        ab.add(7,btn7)
        ab.add(8,btn8)
        ab.add(9,btn9)
        ab.add(10,btn10)

        click(0)
        click(1)
        click(2)
        click(3)
        click(4)
        click(5)
        click(6)
        click(7)
        click(8)
        click(9)
        click(10)
    }
    private fun click(i: Int) {

        ab[i].setOnClickListener {
            if (i==7) {
                if(c==1) {
                    change(7, 8)
                    change(7, 6)
                    change(7, 4)
                    change(7, 4, 1)
                }
            }
            if(i==0){
                if(c==1) {
                    change(0, 1)
                    change(0, 3)
                    change(0, 1, 2)
                    change(0, 3, 6)
                }
            }
            if(i==1){
                if(c==1) {
                    change(1, 0)
                    change(1, 4)
                    change(1, 2)
                    change(1, 4, 7)
                }
            }
            if(i==2){
                if(c==1) {
                    change(2, 1)
                    change(2, 5)
                    change(2, 1, 0)
                    change(2, 5, 8)
                }
            }
            if(i==3){
                if(c==1) {
                    change(3, 0)
                    change(3, 4)
                    change(3, 6)
                    change(3, 4, 5)
                }
            }
            if(i==4) {
                if(c==1) {
                    change(4, 1)
                    change(4, 3)
                    change(4, 7)
                    change(4, 5)
                }
            }
            if(i==5){
                if(c==1) {
                    change(5, 8)
                    change(5, 2)
                    change(5, 4)
                    change(5, 4, 3)
                }
            }
            if(i==6) {
                if(c==1) {
                    change(6, 3)
                    change(6, 7)
                    change(6, 3, 0)
                    change(6, 7, 8)
                }
            }
            if(i==8) {
                if(c==1) {
                    change(8, 7)
                    change(8, 5)
                    change(8, 5, 2)
                    change(8, 7, 6)
                }
            }
            if(i==9){
                if(btn0.text.equals("1")&&btn1.text.equals("2")&&btn2.text.equals("3")&&btn3.text.equals("4")&&btn4.text.equals("5")&&btn5.text.equals("6")&&btn6.text.equals("7")&&btn7.text.equals("8")&&btn8.text.equals(""))
                {
                    c=2
                   btn9.setText("you Win")
                }
            }
            if(i==10){
                c=1
                var c = ArrayList<String>()
                for (i in 1..9){
                    while (true){
                        var a:Double=(Math.random()*9)
                        var b = a.toInt()
                        if(!c.contains(""+ b))
                        {
                            c.add(""+ b)
                            break;
                        }
                    }
                }
                for(i in 0..8) {
                    if (c.get(i).equals("0")) {
                        ab[i].setText("")
                    } else {
                        ab[i].setText(c.get(i))
                    }
                }
                btn9.setText("submit")
            }
        }
    }
    private fun change(i: Int, i1: Int) {

            if(ab[i1].text.toString().equals(""))
            {
                ab[i1].setText(ab[i].text.toString())
                ab[i].setText("")
            }
    }
    private fun change(i:Int,i1:Int,i2:Int){

           if(ab[i2].text.toString().equals(""))
           {
               ab[i2].setText(ab[i1].text.toString())
               ab[i1].setText(ab[i].text.toString())
               ab[i].setText("")
           }
    }
}