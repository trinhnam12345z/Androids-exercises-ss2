package com.trinhnam12345z.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewCoBan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_co_ban);

        ListView listMonhoc = findViewById(R.id.ListMonHoc);

        ArrayList<String> arrMonhoc = new ArrayList<>();
        arrMonhoc.add("Androids");
        arrMonhoc.add("Java");
        arrMonhoc.add("PHP");
        arrMonhoc.add("C#");
        arrMonhoc.add("C++");
        arrMonhoc.add("SQL");
        arrMonhoc.add(".NET");
        arrMonhoc.add("NodeJS");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arrMonhoc);
        listMonhoc.setAdapter(adapter);
        listMonhoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }


}