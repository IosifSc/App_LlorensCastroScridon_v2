package com.example.app_llorenscastroscridon.ui.Domicilio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DomicilioViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DomicilioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}