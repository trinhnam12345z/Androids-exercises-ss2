package com.trinhnam12345z.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SoSanh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_so_sanh);
    }

    public void sosanh(View view){
        EditText editAss = findViewById(R.id.editAss);
        EditText editBss = findViewById(R.id.editBss);

        TextView txtKetquass = findViewById(R.id.txtKetquass);

        float a = Float.parseFloat(editAss.getText().toString());
        float b = Float.parseFloat(editBss.getText().toString());

        if (a > b){
            txtKetquass.setText(a + " > " + b);
        }else{
            txtKetquass.setText(a + " < " + b);
        }

    }
}