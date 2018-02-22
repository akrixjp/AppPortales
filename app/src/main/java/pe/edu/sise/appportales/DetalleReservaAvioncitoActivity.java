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
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");
        arrayList.add("10");
        arrayList.add("11");
        arrayList.add("12");
        arrayList.add("13");
        arrayList.add("14");
        arrayList.add("15");
        arrayList.add("16");
        arrayList.add("17");
        arrayList.add("18");
        arrayList.add("19");
        arrayList.add("20");
        arrayList.add("21");



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
