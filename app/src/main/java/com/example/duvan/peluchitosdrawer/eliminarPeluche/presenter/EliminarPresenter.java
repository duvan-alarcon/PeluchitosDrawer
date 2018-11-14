package com.example.duvan.peluchitosdrawer.eliminarPeluche.presenter;

import com.example.duvan.peluchitosdrawer.eliminarPeluche.interactor.EliminarInteractor;
import com.example.duvan.peluchitosdrawer.eliminarPeluche.interactor.IEliminarInteractor;
import com.example.duvan.peluchitosdrawer.eliminarPeluche.view.IEliminarFragment;

public class EliminarPresenter implements IEliminarPresenter{

    private IEliminarInteractor eliminarInteractor;
    private IEliminarFragment eliminarFragment;

    public EliminarPresenter(IEliminarFragment eliminarFragment) {
        this.eliminarFragment = eliminarFragment;
        eliminarInteractor = new EliminarInteractor(this);
    }

    @Override
    public void eliminarDatos(String nombre) {
        eliminarInteractor.eliminarDatos(nombre);
    }

    @Override
    public void eliminarError(String eliminarMessage) {
        eliminarFragment.eliminarError(eliminarMessage);
    }
}
