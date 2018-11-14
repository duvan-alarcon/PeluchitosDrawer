package com.example.duvan.peluchitosdrawer.eliminarPeluche.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.duvan.peluchitosdrawer.Comunicador;
import com.example.duvan.peluchitosdrawer.R;
import com.example.duvan.peluchitosdrawer.eliminarPeluche.presenter.EliminarPresenter;
import com.example.duvan.peluchitosdrawer.eliminarPeluche.presenter.IEliminarPresenter;


/**
 * A simple {@link Fragment} subclass.
 */
public class EliminarFragment extends Fragment implements IEliminarFragment{

    private EditText eNombre ;
    private Button bEliminar;
    private IEliminarPresenter eliminarPresenter;


    public EliminarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_eliminar, container, false);
        eliminarPresenter = new EliminarPresenter(this);

        eNombre= view.findViewById(R.id.eNombre);
        bEliminar= view.findViewById(R.id.bEliminar);


        bEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eliminarPresenter.eliminarDatos(eNombre.getText().toString());
            }
        });
        return view;
    }

    @Override
    public void eliminarError(String eliminarMessage) {
        Toast.makeText(getContext(),eliminarMessage, Toast.LENGTH_SHORT).show();
    }
}
