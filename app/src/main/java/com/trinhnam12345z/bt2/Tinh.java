package com.trinhnam12345z.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tinh extends AppCompatActivity {

//    Button btnCong, btnNhan, btnTru, btnChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh);

    }
    public void Tinh(View view){
        EditText editA = findViewById(R.id.editA);
        EditText editB = findViewById(R.id.editB);
        EditText phepTinh = findViewById(R.id.editPhepTinh);
        TextView txtKetqua = findViewById(R.id.txtKetqua);

        float a = Float.parseFloat(editA.getText().toString());
        float b = Float.parseFloat(editB.getText().toString());
        String pt = phepTinh.getText().toString();
        float ketqua;

        switch (pt){
            case "+":
                ketqua = a + b ;
                txtKetqua.setText(String.valueOf(ketqua));
                break;
            case "-":
                ketqua = a - b ;
                txtKetqua.setText(String.valueOf(ketqua));
                break;
            case "*":
                ketqua = a * b ;
                txtKetqua.setText(String.valueOf(ketqua));
                break;
            case "/":
                ketqua = a / b ;
                txtKetqua.setText(String.valueOf(ketqua));
                break;
            default: txtKetqua.setText("Phép tính không hợp lệ !");
        }
    }

}