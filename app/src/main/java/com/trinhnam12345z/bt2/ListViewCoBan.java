package com.trinhnam12345z.bt2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewCoBan extends AppCompatActivity {
    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_co_ban);

        ListView listMonhoc = findViewById(R.id.ListMonHoc);
        EditText editTenmonhoc = findViewById((R.id.editTenMonHoc));
        Button btnAddmonhoc = findViewById(R.id.btnAddMonHoc);
        Button btnEditmonhoc = findViewById(R.id.btnEditMonHoc);

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
                vitri = i;
                editTenmonhoc.setText(arrMonhoc.get(i));
            }
        });

        listMonhoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int ii, long l) {
//                Toast.makeText(ListViewCoBan.this, "Giữ : "+arrMonhoc.get(i),Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(ListViewCoBan.this);
                builder.setTitle("Xác nhận ");
                builder.setMessage("Bạn có chắc chắn xóa không ?");
                builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        arrMonhoc.remove(ii);
                        adapter.notifyDataSetChanged();
                    }
                });
                builder.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.create().show();
                return false;
            }
        });

        btnAddmonhoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrMonhoc.add(editTenmonhoc.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        btnEditmonhoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrMonhoc.set(vitri,editTenmonhoc.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }


}