package com.example.app_llorenscastroscridon.ui.Local;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.app_llorenscastroscridon.R;


public class LocalFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

         return inflater.inflate(R.layout.fragment_local, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}