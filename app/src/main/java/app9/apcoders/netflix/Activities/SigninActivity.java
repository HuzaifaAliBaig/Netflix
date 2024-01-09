package app9.apcoders.netflix.Activities;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import app9.apcoders.netflix.MainScreens.MainScreen;
import app9.apcoders.netflix.R;

public class SigninActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin); // Replace with your actual layout file name

        // Initialize views
        emailEditText = findViewById(R.id.emailsignin);
        passwordEditText = findViewById(R.id.passwordsignin);
        signInButton = findViewById(R.id.signinbutton);

        // Set onClickListener for Sign In button
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Simple hard-coded check for demo purposes
                if ("test@example.com".equals(email) && "password".equals(password)) {
                    // Successful sign-in, navigate to main activity
                    navigateToMainActivity();
                } else {
                    // Failed sign-in, show error message or handle accordingly
                    // For simplicity, just displaying a toast message
                    showToast("Invalid email or password");
                }
            }
        });
    }

    private void navigateToMainActivity() {
        // Intent to navigate to the main activity
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
        finish();
    }

    private void showToast(String message) {
        // Display a toast message (You can replace this with your own error handling mechanism)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
