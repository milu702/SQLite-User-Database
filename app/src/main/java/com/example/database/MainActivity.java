
package com.example.database;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editName;
    Button btnAdd, btnDisplay;
    TextView txtNames;

    DatabaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        btnAdd = findViewById(R.id.btnAdd);
        btnDisplay = findViewById(R.id.btnDisplay);
        txtNames = findViewById(R.id.txtNames);

        helper = new DatabaseHelper(this);

        // Add Name button
        btnAdd.setOnClickListener(v -> {
            String name = editName.getText().toString().trim();

            if (name.isEmpty()) {
                editName.setError("Please enter a name");

                Toast.makeText(
                    MainActivity.this,
                    "Name cannot be empty",
                    Toast.LENGTH_SHORT
                ).show();

            } else {
                boolean result = helper.addName(name);

                if (result) {
                    Toast.makeText(
                        MainActivity.this,
                        "Name added successfully",
                        Toast.LENGTH_SHORT
                    ).show();

                    editName.setText("");
                    txtNames.setText(helper.getAllNames());

                } else {
                    Toast.makeText(
                        MainActivity.this,
                        "Failed to add name",
                        Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });

        // Display All Names button
        btnDisplay.setOnClickListener(v -> {
            String names = helper.getAllNames();
            txtNames.setText(names);
        });
    }
}
