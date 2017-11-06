package myfirstgame.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import myfirstgame.wordcounter.R;
import myfirstgame.wordcounter.WordCounter;

public class MainActivity extends AppCompatActivity {

    private EditText textInput;
    private Button countBtn;
    private TextView answerView;
    private WordCounter wc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wc = new WordCounter();
        textInput = findViewById(R.id.inputSentence);
        countBtn = findViewById(R.id.countBtn);
        answerView = findViewById(R.id.answerView);
    }

    public void onCountButtonClicked(View button){
        String questionInput = textInput.getText().toString();
        Log.d(getClass().toString(), questionInput);

        answerView.setText((wc.countWordsUsingMap(questionInput)));

    }


}
