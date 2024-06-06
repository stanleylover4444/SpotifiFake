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

public class SignUpStep3Activity extends AppCompatActivity {

    private Button mBackSignUpStep3;
    private Button mNextSignUpStep3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up_step3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mBackSignUpStep3 = findViewById(R.id.mBackSignUpStep3);
        mBackSignUpStep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpStep3Activity.this , SignUpStep2Activity.class);
                startActivity(intent);
            }
        });

        mNextSignUpStep3 = findViewById(R.id.mNextSignUpStep3);
        mNextSignUpStep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpStep3Activity.this, SignUpStep4Activity.class);
                startActivity(intent);
            }
        });



    }
}