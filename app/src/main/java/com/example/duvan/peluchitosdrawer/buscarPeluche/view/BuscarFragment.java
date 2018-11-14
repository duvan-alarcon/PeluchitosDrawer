package com.example.duvan.peluchitosdrawer.buscarPeluche.view;


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
import com.example.duvan.peluchitosdrawer.buscarPeluche.presenter.BuscarPresenter;
import com.example.duvan.peluchitosdrawer.buscarPeluche.presenter.IBuscarPresenter;


/**
 * A simple {@link Fragment} subclass.
 */
public class BuscarFragment extends Fragment implements IBuscarFragment{

    private EditText eBuscar;
    private Button bBuscar;
    private TextView tNombre, tCodigo, tCantidad, tPrecio;
    //Comunicador interfaz;
    private IBuscarPresenter buscarPresenter;



    public BuscarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_buscar, container, false);
        buscarPresenter = new BuscarPresenter(this);


        eBuscar= view.findViewById(R.id.eBuscar);
        tNombre= view.findViewById(R.id.tNombre);
        tCodigo= view.findViewById(R.id.tCodigo);
        tCantidad= view.findViewById(R.id.tCantidad);
        tPrecio= view.findViewById(R.id.tPrecio);
        bBuscar= view.findViewById(R.id.bBuscar);

        Bundle data = getArguments();
        tNombre.setText(data.getString("nombre"));
        tCodigo.setText(data.getString("codigo"));
        tCantidad.setText(data.getString("cantidad"));
        tPrecio.setText(data.getString("precio"));



        bBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarPresenter.enviarDatosBuscar(eBuscar.getText().toString());

            }
        });

        return view;
    }


    @Override
    public void mostrarError(String errorMessage) {
        Toast.makeText(getContext(),errorMessage, Toast.LENGTH_SHORT).show();
    }
}
