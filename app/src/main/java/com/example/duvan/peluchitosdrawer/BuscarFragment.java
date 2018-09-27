package com.example.duvan.peluchitosdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BuscarFragment extends Fragment {

    private EditText eBuscar;
    private Button bBuscar;
    private TextView tNombre, tCodigo, tCantidad, tPrecio;
    Comunicador interfaz;


    public BuscarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_buscar, container, false);

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
                interfaz.enviarDatosBuscar(eBuscar.getText().toString());

            }
        });

        return view;
    }


}
