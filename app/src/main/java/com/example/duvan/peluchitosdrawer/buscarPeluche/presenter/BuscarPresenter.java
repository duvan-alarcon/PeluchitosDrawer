package com.example.duvan.peluchitosdrawer.buscarPeluche.presenter;

import com.example.duvan.peluchitosdrawer.buscarPeluche.interactor.BuscarInteractor;
import com.example.duvan.peluchitosdrawer.buscarPeluche.interactor.IBuscarInteractor;
import com.example.duvan.peluchitosdrawer.buscarPeluche.view.IBuscarFragment;

public class BuscarPresenter implements IBuscarPresenter {

    private IBuscarInteractor buscarInteractor;
    private IBuscarFragment buscarFragment;

    public BuscarPresenter(IBuscarFragment buscarFragment) {
        this.buscarFragment = buscarFragment;
        buscarInteractor = new BuscarInteractor(this);
    }

    @Override
    public void enviarDatosBuscar( String nombre) {
        buscarInteractor.enviarDatos( nombre);
    }

    @Override
    public void mostrarError(String errorMessage) {
        buscarFragment.mostrarError(errorMessage);
    }
}
