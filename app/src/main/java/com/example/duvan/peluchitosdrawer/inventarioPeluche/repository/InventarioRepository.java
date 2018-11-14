package com.example.duvan.peluchitosdrawer.inventarioPeluche.repository;

import com.example.duvan.peluchitosdrawer.inventarioPeluche.interactor.iInventarioInteractor;

public class InventarioRepository implements iInventarioRepository {

    private iInventarioInteractor inventarioInteractor;

    public InventarioRepository(iInventarioInteractor inventarioInteractor) {
        this.inventarioInteractor = inventarioInteractor;
    }
}
