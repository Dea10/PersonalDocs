package com.example.roomtest02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public List<Word> mAllWords;
    public String strWords = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.mainTextView);

        WordRoomDatabase db = Room.databaseBuilder(getApplicationContext(), WordRoomDatabase.class, "database-name").allowMainThreadQueries().build();

        db.wordDao().insert(new Word("db-test"));

        mAllWords = db.wordDao().getAlphabetizedWords();

        for (Word word: mAllWords) {
            strWords += word.getWord();
            System.out.println(word.getWord());
        }

        textView.setText(strWords);
    }
}
