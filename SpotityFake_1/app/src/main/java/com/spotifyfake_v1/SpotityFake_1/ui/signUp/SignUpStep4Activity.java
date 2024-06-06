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

import com.spotifyfake_v1.SpotityFake_1.ChooseArtists;
import com.spotifyfake_v1.SpotityFake_1.R;

public class SignUpStep4Activity extends AppCompatActivity {
    private Button mBackSignUpStep4;
    private Button mCreateSignUpStep4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up_step4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        mBackSignUpStep4 = findViewById(R.id.mBackSignUpStep4);
        mBackSignUpStep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpStep4Activity.this , SignUpStep3Activity.class);
                startActivity(intent);
            }
        });

        mCreateSignUpStep4 = findViewById(R.id.mCreateSignUpStep4);
        mCreateSignUpStep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpStep4Activity.this, ChooseArtists.class);
                startActivity(intent);
            }
        });


    }
}