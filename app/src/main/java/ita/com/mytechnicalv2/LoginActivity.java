package ita.com.mytechnicalv2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Login(View view){
        Intent login =  new Intent(this, MenuActivity.class);
        startActivity(login);
    }
    public void Back(View view){
        Intent back =  new Intent(this, WelcomeActivity.class);
        startActivity(back);
    }

    public void Forgot(View view){
        Intent forgot =  new Intent(this, ForgotActivity.class);
        startActivity(forgot);
    }
}