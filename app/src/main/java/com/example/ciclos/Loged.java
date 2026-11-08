package com.example.ciclos;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Loged extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.loged_view);

       TextView user = findViewById(R.id.usuario);
       Bundle bundle = getIntent().getBundleExtra("username");
       String username = bundle.getString("user");
       user.setText("Hola " + username + " Benvingut!");
       Button logout = findViewById(R.id.logout);
       logout.setOnClickListener(v -> {
          Intent newIntent = new Intent(Loged.this, Logout.class);
            startActivity(newIntent);
       });

    }
}
