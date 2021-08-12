package sg.edu.rp.id18044455.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener {
            for(i in 1..5){
                Log.d("MainActivity", "$i")
            }
        }//end of button1


        button2.setOnClickListener {
            val word = editText.text.toString()
            if(word.isNotEmpty()){
                for(letter in word){
                    Log.d("MainActivity", "$letter")
                }
            }//end of text validation
            else{
                Toast.makeText(this, "Please enter the word", Toast.LENGTH_SHORT).show()
            }

        }//end of button2


    }//end of onCreate

}//end of class