package devandroid.vantercarlos.appgaseta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import devandroid.vantercarlos.appgaseta.R;

public class SplashActivity extends AppCompatActivity {

    public static final int TIME_OUT_SPLASH = 300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        
        cumutarTalaSplash();
    }

    private void cumutarTalaSplash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent telaPrincipal = new Intent(SplashActivity.this, GasEtaActivity.class);
                startActivity(telaPrincipal);
                finish();
            }
        },TIME_OUT_SPLASH);
    }
}