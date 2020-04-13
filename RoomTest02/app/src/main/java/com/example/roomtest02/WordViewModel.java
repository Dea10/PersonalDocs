package com.example.roomtest02;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;


public class WordViewModel extends AndroidViewModel {
    public WordDao wordDao;
    public WordRoomDatabase db;
    public LiveData<List<Word>> mAllWords;

    public WordViewModel(Application application) {
        super(application);
        db = WordRoomDatabase.getDatabase(application);
        mAllWords = db.wordDao().getAlphabetizedWords();
    }

    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insert(Word word) {
        WordRoomDatabase.databaseWriteExecutor.execute(() -> {
            db.wordDao().insert(word);
        });
    }
}
