package com.example.duvan.peluchitosdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InventarioFragment extends Fragment {

    private TextView tInventario;
    Comunicador interfaz;


    public InventarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_inventario, container, false);

        tInventario= view.findViewById(R.id.tInventario);

        Bundle data = getArguments();
        tInventario.setText(data.getString("info"));

        return view;



    }

}
