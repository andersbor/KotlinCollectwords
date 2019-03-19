package dk.easj.anbo.collectwords3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var words = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainSaveWordButton.setOnClickListener {
            Log.d("MINE", words.toString())
            val newWord = mainWordEditText.text.toString()
            words.add(newWord)
            Log.d("MINE", words.toString())
        }

        mainClearWordsButton.setOnClickListener {
            words.clear()
        }

        mainShowWordsButton.setOnClickListener {
            Log.d("MINE", words.toString())
            //mainMessageTextView.text = words.toString()
            val intent =  Intent(this, ShowWordsActivity::class.java)
            intent.putExtra(WORDS, words)
            startActivity(intent)
        }

        mainShowWordsJavaButton.setOnClickListener {
            val intent =  Intent(this, ShowWordsJavaActivity::class.java)
            intent.putExtra(WORDS, words)
            startActivity(intent)
        }
    }
}
