package pe.edu.sise.appportales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuConsultarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_consultar);
    }

    //Metodos para Menu de Consultas
    public void irTiempoTranscurridoActivity(View view){
        Intent intent=new Intent(getApplicationContext(),TiempoTranscurridoActivity.class);
        startActivity(intent);
    }
    public void irHistoricodeTicketActivity(View view){
        Intent intent=new Intent(getApplicationContext(),HistoricoTicketsActivity.class);
        startActivity(intent);
    }
    public void irUbicarmiautoActivity(View view){
        Intent intent=new Intent(getApplicationContext(),UbicarmiautoActivity.class);
        startActivity(intent);
    }



}
