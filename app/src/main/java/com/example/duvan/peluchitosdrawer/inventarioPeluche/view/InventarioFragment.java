package com.example.duvan.peluchitosdrawer.inventarioPeluche.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.duvan.peluchitosdrawer.Comunicador;
import com.example.duvan.peluchitosdrawer.R;
import com.example.duvan.peluchitosdrawer.inventarioPeluche.presenter.InventarioPresenter;
import com.example.duvan.peluchitosdrawer.inventarioPeluche.presenter.iInventarioPresenter;


/**
 * A simple {@link Fragment} subclass.
 */
public class InventarioFragment extends Fragment implements iInventarioFragment {

    private TextView tInventario;
    private iInventarioPresenter inventarioPresenter;


    public InventarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_inventario, container, false);
        inventarioPresenter= new InventarioPresenter(this);

        tInventario= view.findViewById(R.id.tInventario);

        Bundle data = getArguments();
        tInventario.setText(data.getString("info"));

        return view;



    }

}
