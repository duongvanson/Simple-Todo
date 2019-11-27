package dev.duongson.simpletodo.utils;

import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StoreData {
    private String fileName = "";
    private File file;

    public StoreData(String fileName) {
        this.fileName = fileName;
    }

    public boolean existFileData() throws IOException {
        file = new File(fileName);
        if (file.exists()){
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);
            if (br.readLine() == null) return false;
            Log.d("XXX", "existFileData: TRUE");
            return true;
        }else{
            FileWriter writer = new FileWriter(fileName);
            writer.flush();
            writer.close();
            Log.d("XXX", "existFileData: FALSE");
            return false;
        }
    }
}
