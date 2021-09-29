package com.trinhnam12345z.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CheckBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
    }

    public void check(View view){
        android.widget.CheckBox cb1 = findViewById(R.id.checkBox1);
        android.widget.CheckBox cb2 = findViewById(R.id.checkBox2);
        android.widget.CheckBox cb3 = findViewById(R.id.checkBox3);
        TextView ketqua = findViewById(R.id.txtcbKetqua);

        String chuoi = "Các CheckBox đã chọn ! \n";
        if(cb1.isChecked() == false && cb2.isChecked() == false && cb3.isChecked() == false){
            chuoi = "Chưa chọn CheckBox nào !";
        }
        if (cb1.isChecked()) {
            chuoi += cb1.getText() + "\n";
        }
        if (cb2.isChecked()) {
            chuoi += cb2.getText() + "\n";
        }
        if (cb3.isChecked()) {
            chuoi += cb3.getText() + "\n";
        }

        ketqua.setText(chuoi);

    }
}