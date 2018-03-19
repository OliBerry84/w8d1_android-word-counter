package com.wordcounter.danpeet.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputWordsEditText;
    private TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate");
        inputWordsEditText = findViewById(R.id.inputWordsEditText);
        outputTextView = findViewById(R.id.mainOutputTextView);
    }

    public void onCountButtonClicked(View clickedView) {
        Log.d("MainActivity", "count button clicked");
        String inputText = inputWordsEditText.getText().toString();
        Log.d("MainActivity", "got words - \"" + inputText + "\"");
        WordCounter wordCounter = new WordCounter(inputText);
    }
}
