package com.example.appautos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AutoAdapter extends ArrayAdapter<Auto> {
    private Context mcontext;
    private List<Auto> autos;
    private int resourceLayout;

    public AutoAdapter(@NonNull Context context, int resource, List<Auto> objects) {
        super(context, resource, objects);
        this.autos = objects;
        this.mcontext = context;
        this.resourceLayout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if(view==null)
            view = LayoutInflater.from(mcontext).inflate(resourceLayout,null);

        Auto auto = autos.get(position);
        TextView datos = view.findViewById(R.id.datos_auto_txt);
        datos.setText(auto.toString());

        return view;
    }
}
