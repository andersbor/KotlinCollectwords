package dk.easj.anbo.collectwords3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_words.*

const val WORDS = "WORDS"

class ShowWordsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_words)
        //val intent = getIntent()

        val words = intent.getStringArrayListExtra(WORDS)
        showWordsMessageTextView.text = words.toString()
    }
}
