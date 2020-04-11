package com.example.viewmodeldemo00;

import androidx.lifecycle.ViewModel;

public class ViewModelCounter extends ViewModel {
    private Integer counter = 0;

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
}
