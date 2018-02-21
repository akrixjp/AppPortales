package pe.edu.sise.appportales.modelo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import pe.edu.sise.appportales.R;

/**
 * Created by JEFFRY on 20/02/2018.
 */

public class DetalleActivityAvioncito extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.detalles_avioncitos_2);
        getSupportActionBar().setTitle(getIntent().getExtras().get("nombre").toString());
    }
}
