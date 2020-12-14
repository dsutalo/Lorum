package com.example.lorum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Players extends AppCompatActivity {

    EditText etPlayer1, etPlayer2, etPlayer3, etPlayer4;
    public static String Player1Name, Player2Name, Player3Name, Player4Name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        setupUI();

        Player1Name = etPlayer1.getText().toString();
        Player2Name = etPlayer2.getText().toString();
        Player3Name = etPlayer3.getText().toString();
        Player4Name = etPlayer4.getText().toString();




    }

    private void setupUI() {

        etPlayer1 = findViewById(R.id.etFirstPlayerName);
        etPlayer2 = findViewById(R.id.etSecondPlayerName);
        etPlayer3 = findViewById(R.id.etThirdPlayerName);
        etPlayer4 = findViewById(R.id.etFourthPlayerName);

    }

    public void Apply(View view) {

        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }
}
