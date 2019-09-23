package com.example.thuchanhandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lsGirl;
    ArrayList<Girl> arrayGilr;
    GirlAdapter girlAdapter;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
        AnhXa();
        girlAdapter = new GirlAdapter(this,R.layout.dong_girl,arrayGilr);
        lsGirl.setAdapter(girlAdapter);



    }

    private void AnhXa(){
        lsGirl    = (ListView) findViewById(R.id.listviewGirl);
        arrayGilr = new ArrayList<>();
        arrayGilr.add(new Girl(R.drawable.girl1,"Gai A","Dep xinh"));
        arrayGilr.add(new Girl(R.drawable.girl3,"Gai B","Rat vui ve"));
        arrayGilr.add(new Girl(R.drawable.girl3,"Gai C","Chu dao"));
        arrayGilr.add(new Girl(R.drawable.girl4,"Gai D","Sang tao"));
        arrayGilr.add(new Girl(R.drawable.girl5,"Gai E","Cute"))    ;



    }
}
