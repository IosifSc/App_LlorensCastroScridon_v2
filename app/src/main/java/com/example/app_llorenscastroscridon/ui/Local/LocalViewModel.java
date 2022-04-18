package com.example.app_llorenscastroscridon.ui.Local;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocalViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LocalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}