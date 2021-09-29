package com.trinhnam12345z.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GiaiPhuongTrinh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giai_phuong_trinh);
    }

    public void giaipt(View view){
        EditText editAcb2 = findViewById(R.id.editAcb2);
        EditText editBcb2 = findViewById(R.id.editBcb2);
        EditText editCcb2 = findViewById(R.id.editCcb2);

        TextView txtKetquacb2 = findViewById(R.id.txtKetquacb2);

        float a = Float.parseFloat(editAcb2.getText().toString());
        float b = Float.parseFloat(editBcb2.getText().toString());
        float c = Float.parseFloat(editCcb2.getText().toString());

        float ketqua;

        if (a == 0) {
            if (b == 0) {
                txtKetquacb2.setText("Phương trình vô nghiệm!");
            } else {
                txtKetquacb2.setText("Phương trình có một nghiệm: "  + "x = " + (-c / b));
            }
        }else {
            float delta = b*b - 4*a*c;
            float x1;
            float x2;
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                txtKetquacb2.setText("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                txtKetquacb2.setText("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
            } else {
                txtKetquacb2.setText("Phương trình vô nghiệm!");
            }
        }
    }
}