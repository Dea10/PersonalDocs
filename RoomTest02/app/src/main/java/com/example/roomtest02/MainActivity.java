package com.example.roomtest02;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public String strWords = "";

    public WordViewModel mWordViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.mainTextView);

        mWordViewModel = new ViewModelProvider(this, new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(WordViewModel.class);
        //mWordViewModel = new ViewModelProvider(this).get(WordViewModel.class);

        suscribe();

        mWordViewModel.insert(new Word("deaTest"));
    }

    public void suscribe() {
        mWordViewModel.getAllWords().observe(this, new Observer<List<Word>>() {
            @Override
            public void onChanged(@Nullable final List<Word> words) {
                // Update the cached copy of the words in the adapter.

                for (Word word: words) {
                    strWords += word.getWord();
                    System.out.println(word.getWord());
                }

                textView.setText(strWords);
            }
        });
    }
}
