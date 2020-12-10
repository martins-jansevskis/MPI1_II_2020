package lv.martins.mpi1_ii_2020;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity2 extends AppCompatActivity {
    int SIZE_OF_BUFFER = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
//        int value = sharedPref.getInt("NEW_SCORE", 0);
//        Toast.makeText(this, "Preference value " + value, Toast.LENGTH_LONG).show();

//        String str = "Rakstits faila";
//        try {
//            FileOutputStream fOut = openFileOutput("samplefile.txt", MODE_PRIVATE);
//            OutputStreamWriter oRaxt = new OutputStreamWriter(fOut);
//            oRaxt.write(str);
//            oRaxt.flush();
//            oRaxt.close();
//        } catch (IOException ie) {
//            ie.printStackTrace();
//        }

//        try {
//            FileInputStream fIn = openFileInput("samplefile.txt");
//            InputStreamReader iLas = new InputStreamReader(fIn);
//            char[] lasBuffer = new char[SIZE_OF_BUFFER];
//            String str = "";
//            int chrRead;
//            while ((chrRead = iLas.read(lasBuffer))>0) {
//                String lasStr = String.copyValueOf(lasBuffer, 0, chrRead);
//                str += lasStr;
//                lasBuffer = new char[SIZE_OF_BUFFER];
//            }
//            Toast.makeText(this, "File value " + str, Toast.LENGTH_LONG).show();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    public void goBack(View v){
        finish();
    }
}