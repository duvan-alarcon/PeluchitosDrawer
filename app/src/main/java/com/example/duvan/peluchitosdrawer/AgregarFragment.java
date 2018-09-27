package com.example.duvan.peluchitosdrawer;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AgregarFragment extends Fragment {

    private EditText eCodigo, eNombre, eCantidad, ePrecio;
    private Button bGuardar;
    Comunicador interfaz;

    public AgregarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_agregar, container, false);

        eCodigo= view.findViewById(R.id.eCodigo);
        eNombre= view.findViewById(R.id.eNombre);
        eCantidad= view.findViewById(R.id.eCantidad);
        ePrecio= view.findViewById(R.id.ePrecio);
        bGuardar= view.findViewById(R.id.bGuardar);

        bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaz.enviarDatos(Integer.parseInt(eCodigo.getText().toString()),
                        (eNombre.getText().toString()),
                        (Integer.parseInt(eCantidad.getText().toString())),
                        (Integer.parseInt(ePrecio.getText().toString())));

            }
        });

        return view;


    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        interfaz = (Comunicador) activity;
    }
}
