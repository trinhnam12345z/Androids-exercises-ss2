package com.trinhnam12345z.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void login(View view){
        EditText txtUsername = findViewById(R.id.username);
        EditText txtPassword = findViewById(R.id.password);
        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnCancel = findViewById(R.id.btnCancel);

        String username = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();

        if(username.equals("admin") && password.equals("admin")){
            Intent GT = new Intent(MainActivity.this,GiaiThua.class);
            startActivity(GT);
            GT.putExtra("username", username);
        }else{
            Toast.makeText(MainActivity.this,"Đăng nhập thất bại !",Toast.LENGTH_LONG).show();
        }

    }
}