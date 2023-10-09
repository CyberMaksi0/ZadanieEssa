package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText loginEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEditText = findViewById(R.id.loginEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = loginEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Tutaj można dodać logikę weryfikacji hasła

                // Tworzymy nową intencję do uruchomienia drugiej aktywności
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                // Przekazujemy login do drugiej aktywności
                intent.putExtra("login", login);

                // Uruchamiamy drugą aktywność
                startActivity(intent);
            }
        });
    }
}
