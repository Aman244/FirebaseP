package com.example.firebasep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
public Button Login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = (Button)findViewById(R.id.Loginbtn);
        register = (Button)findViewById(R.id.Registerbtn);
    }

}
