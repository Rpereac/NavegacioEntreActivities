package com.example.ciclos;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("ONALGO", "OnCreate");
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText user = findViewById(R.id.user);
        EditText pass = findViewById(R.id.pass);
        TextView error = findViewById(R.id.error);
        Button logIn = findViewById(R.id.logIn);
        Intent loged =  new Intent(MainActivity.this, Loged.class);

        logIn.setOnClickListener(v -> {

            String userValue = user.getText().toString().trim();
            String passValue = pass.getText().toString().trim();

            boolean logedc = userValue.isBlank() || passValue.isBlank();

            if(!logedc){
                Bundle bundleLoged = new Bundle();
                bundleLoged.putString("user", userValue);
                loged.putExtra("username",bundleLoged);
                startActivity(loged, bundleLoged);
            } else{
                error.setText("No has omplit els camps necesaris");
                error.setTextColor(getResources().getColor(R.color.red));
           }

        });
    }

}