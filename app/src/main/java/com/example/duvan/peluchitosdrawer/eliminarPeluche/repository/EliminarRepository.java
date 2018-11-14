package com.example.duvan.peluchitosdrawer.eliminarPeluche.repository;

import com.example.duvan.peluchitosdrawer.eliminarPeluche.interactor.IEliminarInteractor;

public class EliminarRepository implements IEliminarRepository {

    private IEliminarInteractor eliminarInteractor;

    public EliminarRepository(IEliminarInteractor eliminarInteractor) {
        this.eliminarInteractor = eliminarInteractor;
    }

    @Override
    public void eliminarContacto(String nombre) {
        eliminarInteractor.eliminarDatos(nombre);
    }
}
