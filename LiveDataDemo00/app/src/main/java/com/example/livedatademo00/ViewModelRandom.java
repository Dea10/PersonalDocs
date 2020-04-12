package com.example.livedatademo00;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelRandom extends ViewModel {
    public MutableLiveData<Integer> liveDataInteger = new MutableLiveData<>();

    public LiveData<Integer> getInteger() {
        return liveDataInteger;
    }

    public void setIntegerReceived(Integer newInteger) {
        liveDataInteger.postValue(newInteger);
    }
}
