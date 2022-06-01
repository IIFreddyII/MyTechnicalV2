package ita.com.mytechnicalv2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void Login(View view){
        Intent login =  new Intent(this, LoginActivity.class);
        startActivity(login);
    }

    public void Register(View view){
        Intent register =  new Intent(this, RegisterActivity.class);
        startActivity(register);
    }
}