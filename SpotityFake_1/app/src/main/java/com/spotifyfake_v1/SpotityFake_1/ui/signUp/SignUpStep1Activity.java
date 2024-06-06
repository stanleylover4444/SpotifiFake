package com.spotifyfake_v1.SpotityFake_1.ui.signUp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.spotifyfake_v1.SpotityFake_1.ui.main.MainActivity;
import com.spotifyfake_v1.SpotityFake_1.R;


public class SignUpStep1Activity extends AppCompatActivity {

    private Button mBackSignUpStep1;
    private Button mNextSignUpStep1;
    //ctrl alt l
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up_step1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mBackSignUpStep1 = findViewById(R.id.mBackSignUpStep1);
        mNextSignUpStep1 = findViewById(R.id.mNextSignUpStep1);

        init();
        getDate();
    }

    private void init() {

        mBackSignUpStep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //navigate(MainActivity.class);
                finish();
            }
        });

        mNextSignUpStep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navigate(SignUpStep2Activity.class);
            }
        });
    }

    private void getDate() {

    }

    private void navigate(Class<?> activity) {
        Intent intent = new Intent(SignUpStep1Activity.this, activity);
        startActivity(intent);
    }
}