package dev.duongson.simpletodo.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.duongson.simpletodo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToDoFragment extends Fragment {
    public ToDoFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_to_do, container, false);
    }

}
