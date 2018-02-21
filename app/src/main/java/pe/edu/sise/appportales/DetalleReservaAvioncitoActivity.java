package pe.edu.sise.appportales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import pe.edu.sise.appportales.modelo.DetalleActivityAvioncito;
import pe.edu.sise.appportales.modelo.GridAvioncitosAdapter;

public class DetalleReservaAvioncitoActivity extends AppCompatActivity {

    protected GridView gridView;
    protected GridAvioncitosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_reserva_avioncito);

        ArrayList <String> arrayList=new ArrayList<>();
        arrayList.add("Paola");
        arrayList.add("Ricardo");
        arrayList.add("Jose");
        arrayList.add("Pepe");
        arrayList.add("Juan");
        arrayList.add("Mia");

        gridView=(GridView) findViewById(R.id.am_gv_gridview);
        adapter=new GridAvioncitosAdapter(this,arrayList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent(getApplicationContext(), DetalleActivityAvioncito.class);
                intent.putExtra("nombre",adapter.getItem(i).toString());
                startActivity(intent);
            }
        });
    }
}
