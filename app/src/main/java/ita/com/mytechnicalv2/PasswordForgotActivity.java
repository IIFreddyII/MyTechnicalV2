package ita.com.mytechnicalv2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PasswordForgotActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_forgot);
    }
    public void Back(View view){
        Intent back =  new Intent(this, ForgotActivity.class);
        startActivity(back);
    }

    public void Next(View view){
        Intent next =  new Intent(this, CongratulationsActivity.class);
        startActivity(next);
    }
}