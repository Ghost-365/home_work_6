package com.example.home_work_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView tv_forget, tv_tapHere, tv_welcome, tv_welcom2;
    private EditText email, password;
    private Button go;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_forget = findViewById(R.id.forget);
        tv_tapHere = findViewById(R.id.tap_here);
        tv_welcome = findViewById(R.id.welcome);
        tv_welcom2 = findViewById(R.id.welcome2);
        email = findViewById(R.id.hi);
        password = findViewById(R.id.hi2);
        go = findViewById(R.id.go);
        constraintLayout = findViewById(R.id.edit_texts);

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (email.getText().toString().length() >= 1 && password.getText().toString().length() >= 1) {
                    go.setBackgroundColor(Color.parseColor("#FF5722"));
                } else {
                    go.setBackgroundColor(Color.parseColor("#A6A6A6"));
                }
            }
        });
        go.setOnClickListener(e -> {
            if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                constraintLayout.setVisibility(View.INVISIBLE);
                Toast.makeText(this, "Вы ввели правильно пароль", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Вы ввели неправильный пароль или логин", Toast.LENGTH_SHORT).show();
            }
        });
    }
}