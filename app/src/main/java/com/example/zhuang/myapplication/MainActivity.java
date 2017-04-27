package com.example.zhuang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AlbumItem> albumlist = new ArrayList<AlbumItem>();

        albumlist.add(new AlbumItem("Pacers",R.drawable.j,"102","Cavaliers",R.drawable.i,"106"));
        albumlist.add(new AlbumItem("Bulls",R.drawable.l,"95","Celtics",R.drawable.k,"104"));
        AlbumArrayAdapter adapter = new AlbumArrayAdapter(this,albumlist);

        ListView nba = (ListView)findViewById(R.id.nba);
        nba.setAdapter(adapter);
    }
}
