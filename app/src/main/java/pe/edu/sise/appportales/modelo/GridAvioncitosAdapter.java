package pe.edu.sise.appportales.modelo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import pe.edu.sise.appportales.R;

/**
 * Created by JEFFRY on 20/02/2018.
 */

public class GridAvioncitosAdapter extends BaseAdapter{

    private Context context;
    private ArrayList<String> arrayList;

    public GridAvioncitosAdapter(Context context, ArrayList<String> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view==null){
            LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(R.layout.item_gridavioncito,null);
        }
        TextView tituloTv=(TextView)view.findViewById(R.id.ig_tv_titulo);
        tituloTv.setText(arrayList.get(i));
        return view;
    }
}
