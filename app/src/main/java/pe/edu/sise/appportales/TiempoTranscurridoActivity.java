package pe.edu.sise.appportales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.TextView;

public class TiempoTranscurridoActivity extends AppCompatActivity {

    protected TextView textView2;
    protected Chronometer chronometer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempo_transcurrido);
        textView2=findViewById(R.id.textView2);
        chronometer2=findViewById(R.id.chronometer2);
    }
}
