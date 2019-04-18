package com.example.fitbitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //feeling Anxious button
        button = (Button) findViewById(R.id.buttonAnxious);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FeelingAnxious();
                }
        });
    }

    public void FeelingAnxious() {
        Intent intent = new Intent(this, FeelingAnxious.class);
        startActivity(intent);


        //feeling panicked button
        button = (Button) findViewById(R.id.buttonPanicked);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FeelingPanicked();
            }
        });
    }

    public void FeelingPanicked() {
        Intent intent = new Intent(this, FeelingPanicked.class);
        startActivity(intent);


        //info button
        button = (Button) findViewById(R.id.buttonInfo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info();
            }
        });
    }

    public void Info() {
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);


        //LOW button
        button = (Button) findViewById(R.id.buttonLow);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Low();
            }
        });
    }
    public void Low() {
        Intent intent = new Intent(this, Low.class);
        startActivity(intent);


        //NORMAL button
        button = (Button) findViewById(R.id.buttonNormal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Normal();
            }
        });
    }
    public void Normal() {
        Intent intent = new Intent(this, Normal.class);
        startActivity(intent);

        //HIGH button
        button = (Button) findViewById(R.id.buttonHigh);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                High();
            }
        });
    }

    public void High() {
        Intent intent = new Intent(this, High.class);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId() ;{

            if (id == R.id.menu) {
                Toast.makeText(this, "Home was selected", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, MainActivity.class));
            }
            else if (id == R.id.menu1) {
                Toast.makeText(this, "Feeling Anxious was selected", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, FeelingAnxious.class));
            }
            else if (id == R.id.menu2) {
            Toast.makeText(this, "Feeling Panicked was selected", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, FeelingPanicked.class));
            }
            else if (id==R.id.menu3) {
                Toast.makeText(this, "Information about Anxiety and Panic Attacks", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, Info.class));
            }
            else if (id==R.id.menu4) {
                Toast.makeText(this, "low Heart Rate", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, Low.class));
            }
            else if (id==R.id.menu5) {
                Toast.makeText(this, "Normal Heart Rate", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, Normal.class));
            }
            else if (id==R.id.menu6) {
                Toast.makeText(this, "High Heart Rate", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, High.class));
            }

                return super.onOptionsItemSelected(item);
        }

    }
}

