package alishev.neil.com.implicitintentsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpenWebpageButton(View view) {
        Toast.makeText(this, "Открыть веб страницу", Toast.LENGTH_SHORT).show();
    }

    public void onClickOpenMapButton(View view) {
        Toast.makeText(this, "Открыть карту", Toast.LENGTH_SHORT).show();
    }

    // TODO: Реализуйте свой собственный неявный Intent
    public void yourOwnImplicitIntent(View view) {
        Toast.makeText(this, "Ваш неявный Intent", Toast.LENGTH_SHORT).show();
    }
}
