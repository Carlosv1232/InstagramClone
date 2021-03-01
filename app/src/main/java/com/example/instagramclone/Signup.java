package com.example.instagramclone;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class Signup extends AppCompatActivity {

    public static final String TAG = "Signup";
    private EditText etUsername;
    private EditText etPassword;
    private Button btnSignup;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnSignup);

        /*
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick Signup");
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                if(username.isEmpty() || password.isEmpty()){
                    Toast.makeText(Signup.this, "Username or Password is Empty", Toast.LENGTH_SHORT).show();
                    etUsername.setText("");
                    etPassword.setText("");
                    return;
                }
                ParseSignUp(username, password);
                finish();
            }
        });

         */

    }

    private void ParseSignUp(String username, String password) {
    // Create the ParseUser
        ParseUser user = new ParseUser();
    // Set core properties
            user.setUsername(username);
            user.setPassword(password);
    // Invoke signUpInBackground
            user.signUpInBackground(new SignUpCallback() {
                public void done(ParseException e) {
                    if (e == null) {
                        Toast.makeText(Signup.this, "Profile Created!", Toast.LENGTH_LONG).show();
                        return;
                    } else {
                        Log.e(TAG, "Something went wrong with the sign up", e);
                        return;
                    }
                }
            });
        }
}
