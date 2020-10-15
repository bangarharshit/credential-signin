package com.google.example.credentialssignin;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        findViewById(R.id.save_button_password).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                AutofillManager autofillManager = getSystemService(AutofillManager.class);
                autofillManager.commit();
                Intent intent = new Intent(FourthActivity.this, SecondActivity.class);
                FourthActivity.this.startActivity(intent);
            }
        });
    }
}
