package pe.edu.sise.appportales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //primer commit de este proyecto
    protected Button btningresar,btnregistrese;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btningresar= (Button) findViewById(R.id.btningresar);
        btnregistrese=(Button)findViewById(R.id.btnregistrar);
    }

    public void irLogin(View view){
        Intent intent=new Intent(
                getApplicationContext(),
                LoginActivity.class);
        startActivity(intent);
        finish();
    }
    public void irRegistrarse(View view){
        Intent intent=new Intent(
                getApplicationContext(),
                RegistreseActivity.class);
        startActivity(intent);
        finish();
    }

}
