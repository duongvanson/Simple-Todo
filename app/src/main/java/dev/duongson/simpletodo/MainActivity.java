package dev.duongson.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.IOException;

import dev.duongson.simpletodo.fragments.BlankFragment;
import dev.duongson.simpletodo.fragments.ToDoFragment;
import dev.duongson.simpletodo.utils.StoreData;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm;
    File directory;
    StoreData sd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        directory =  getFilesDir();
        sd = new StoreData(directory.getPath()+"todos.json");
        fm = getSupportFragmentManager();
        try {
            if (sd.existFileData()){
                FragmentTransaction ft_rep = fm.beginTransaction();
                ft_rep.replace(R.id.frame_layout, new ToDoFragment());
                ft_rep.commit();
            }else{
                FragmentTransaction ft_rep = fm.beginTransaction();
                ft_rep.replace(R.id.frame_layout, new BlankFragment());
                ft_rep.commit();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
