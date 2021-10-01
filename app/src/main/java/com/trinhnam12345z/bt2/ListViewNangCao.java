package com.trinhnam12345z.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewNangCao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_nang_cao);

        ListView listViewTraiCay = findViewById(R.id.listViewTraiCay);
        ArrayList<TraiCay> arrTraiCay = new ArrayList<>();
        TraiCayAdapter adapter;

        arrTraiCay.add(new TraiCay("Angular","De vl",R.drawable.ic_launcher_background));
        arrTraiCay.add(new TraiCay("Angular","De vl",R.drawable.ic_launcher_background));
        arrTraiCay.add(new TraiCay("Angular","De vl",R.drawable.ic_launcher_background));
        arrTraiCay.add(new TraiCay("Angular","De vl",R.drawable.ic_launcher_background));
        arrTraiCay.add(new TraiCay("Angular","De vl",R.drawable.ic_launcher_background));
        arrTraiCay.add(new TraiCay("Angular","De vl",R.drawable.ic_launcher_background));

        adapter = new TraiCayAdapter(this,R.layout.row,arrTraiCay);
        listViewTraiCay.setAdapter(adapter);
    }
}