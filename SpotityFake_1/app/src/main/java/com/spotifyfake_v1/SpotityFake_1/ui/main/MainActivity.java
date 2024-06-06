package com.spotifyfake_v1.SpotityFake_1.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.spotifyfake_v1.SpotityFake_1.R;
import com.spotifyfake_v1.SpotityFake_1.ui.login.LoginActivity;
import com.spotifyfake_v1.SpotityFake_1.ui.signUp.SignUpStep1Activity;


public class MainActivity extends AppCompatActivity {


    private Button mSignUpFreeButton;

    private Button mSignUpGGButton;
    private Button mSignUpFBButton;
    private Button mSignUpAPButton;


    private TextView LoginTextView;
    // chữ cái đầu viết thường, chỉ có c


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, 0, systemBars.right, 0);
            return insets;


        });

        LoginTextView = findViewById(R.id.LoginText);


        LoginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });


        mSignUpFreeButton = findViewById(R.id.mSignUpFreeButton);
        mSignUpFreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUpStep1Activity.class);
                startActivity(intent);
                //finish();
            }
        });

        mSignUpGGButton = findViewById(R.id.mSignUpGGButton);
        mSignUpGGButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(MainActivity.this, ManHinhDangNhap.class);
                // startActivity(intent);
                Toast.makeText(MainActivity.this, "Bấm vào hiện gg", Toast.LENGTH_SHORT).show();
            }
        });

        mSignUpFBButton = findViewById(R.id.mSignUpFBButton);
        mSignUpFBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(MainActivity.this, ManHinhDangNhap.class);
                //  startActivity(intent);
                Toast.makeText(MainActivity.this, "Bấm vào hiện  fb", Toast.LENGTH_SHORT).show();
            }
        });

        mSignUpAPButton = findViewById(R.id.mSignUpAPButton);
        mSignUpAPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, ManHinhDangNhap.class);
                //startActivity(intent);
                Toast.makeText(MainActivity.this, "Bấm vào hiện app", Toast.LENGTH_SHORT).show();
            }
        });


    }
}