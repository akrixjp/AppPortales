package pe.edu.sise.appportales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    protected EditText etUsuario,etPass;
    protected Button btniniciar,btniniciarconface,btniniciarcongoogle;
    protected TextView tvrecuperarpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btniniciar=(Button) findViewById(R.id.btnIniciar);
        btniniciarconface=(Button) findViewById(R.id.btnIniciarConFacebook);
        btniniciarcongoogle=(Button) findViewById(R.id.btnIniciarconGoogle);
        tvrecuperarpass=(TextView)findViewById(R.id.tvOlvidastecontrasena);
        etUsuario=(EditText)findViewById(R.id.edtUsuario);
        etPass=(EditText)findViewById(R.id.edtContrasena);

    }

    public void irMenuPrincipal(View view){

        String usu=etPass.getText().toString();
        String pas=etPass.getText().toString();

        if(usu.equals("j")&&pas.equals("j")){
            Intent intent=new Intent(getApplicationContext(),
                    PrincipalActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(),
                    "Usuario o Contraseña no son válidos",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void irRecuperarPass(View view){
        Intent intent=new Intent(getApplicationContext(),
                MainActivity.class);
        startActivity(intent);
    }
}
