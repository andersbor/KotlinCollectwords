package dk.easj.anbo.collectwords3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowWordsJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_words_java);

        Intent intent = getIntent();
        // https://kotlinlang.org/docs/reference/java-to-kotlin-interop.html
        ArrayList<String> words = intent.getStringArrayListExtra(ShowWordsActivityKt.WORDS);
        Log.d("MINE", words + "");

        TextView view = findViewById(R.id.showWordsJavaTextView);
        view.setText(words.toString());
    }
}
