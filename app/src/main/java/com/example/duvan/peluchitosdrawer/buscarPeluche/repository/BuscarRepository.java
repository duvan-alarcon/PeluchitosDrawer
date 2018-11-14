package com.example.duvan.peluchitosdrawer.buscarPeluche.repository;

import com.example.duvan.peluchitosdrawer.buscarPeluche.interactor.IBuscarInteractor;

public class BuscarRepository implements IBuscarRepository{

    private IBuscarInteractor buscarInteractor;

    public BuscarRepository(IBuscarInteractor buscarInteractor) {
        this.buscarInteractor = buscarInteractor;
    }

    @Override
    public void buscarContacto(String nombre) {
        //hacer la conexion con la base de datos
    }
}
