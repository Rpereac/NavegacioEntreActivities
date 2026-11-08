package com.example.ciclos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Logout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.logout_view);

        Button volver = findViewById(R.id.volver);
        volver.setOnClickListener(v -> {
            Intent newIntent = new Intent(Logout.this, MainActivity.class);
            startActivity(newIntent);
        });

    }
}