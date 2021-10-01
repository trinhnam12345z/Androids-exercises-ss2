package com.trinhnam12345z.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GiaiThua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giai_thua);

        TextView txtUsername = findViewById(R.id.txtUserName);

        Bundle bd = getIntent().getExtras();
        txtUsername.setText(bd.getString("username"));
    }



    public void tinhGiaiThua(View view){
        EditText a = findViewById(R.id.editGiaiThua);
        TextView txt = findViewById(R.id.txtKetquaGiaithua);
        int n = Integer.parseInt(a.getText().toString());
        int rs = 1;
        for (int i= 1;i<=n;i++){
            rs = rs * i;
        }

        txt.setText(String.valueOf(rs));
    }
}