package com.example.duvan.peluchitosdrawer.agregarPeluche.presenter;

import android.widget.Toast;

import com.example.duvan.peluchitosdrawer.agregarPeluche.interactor.AgregarInteractor;
import com.example.duvan.peluchitosdrawer.agregarPeluche.interactor.IAgregarInteractor;
import com.example.duvan.peluchitosdrawer.agregarPeluche.view.IAgregarFragment;

public class AgregarPresenter  implements IAgregarPresenter{

    private IAgregarInteractor agregarInteractor;
    private IAgregarFragment agregarFragment;

    public AgregarPresenter(IAgregarFragment agregarFragment) {
        this.agregarFragment = agregarFragment;
        agregarInteractor = new AgregarInteractor(this);
    }

    @Override
    public void enviarDatosAgregar(int codigo, String nombre, int cantidad, int precio) {
        agregarInteractor.enviarDatosAgregar(codigo, nombre, cantidad, precio);
    }

    @Override
    public void mostrarError(String errorMessage) {
        agregarFragment.mostrarError(errorMessage);
    }
}
