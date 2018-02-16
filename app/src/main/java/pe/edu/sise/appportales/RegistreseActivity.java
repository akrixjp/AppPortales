package pe.edu.sise.appportales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistreseActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrese);

    }

    public void irlogin(View view){
        Intent intent=new Intent(getApplicationContext(),
                LoginActivity.class);
        startActivity(intent);

    }
}
