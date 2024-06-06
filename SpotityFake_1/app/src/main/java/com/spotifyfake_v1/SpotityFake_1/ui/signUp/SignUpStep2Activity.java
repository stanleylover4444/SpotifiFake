package com.spotifyfake_v1.SpotityFake_1.ui.signUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.spotifyfake_v1.SpotityFake_1.R;

public class SignUpStep2Activity extends AppCompatActivity {
    private Button mBackSignUpStep2;
    private Button mNextSignUpStep2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up_step2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mBackSignUpStep2 = findViewById(R.id.mBackSignUpStep2);
        mBackSignUpStep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpStep2Activity.this , SignUpStep1Activity.class);
                startActivity(intent);
            }
        });

        mNextSignUpStep2 = findViewById(R.id.mNextSignUpStep2);
        mNextSignUpStep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpStep2Activity.this, SignUpStep3Activity.class);
                startActivity(intent);
            }
        });

    }
}