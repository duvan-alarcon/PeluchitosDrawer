package com.example.duvan.peluchitosdrawer.inventarioPeluche.interactor;

import com.example.duvan.peluchitosdrawer.inventarioPeluche.presenter.iInventarioPresenter;
import com.example.duvan.peluchitosdrawer.inventarioPeluche.repository.InventarioRepository;
import com.example.duvan.peluchitosdrawer.inventarioPeluche.repository.iInventarioRepository;

public class InventarioInteractor implements iInventarioInteractor {

    private iInventarioPresenter inventarioPresenter;
    private iInventarioRepository inventarioRepository;

    public InventarioInteractor(iInventarioPresenter inventarioPresenter) {
        this.inventarioPresenter = inventarioPresenter;
        inventarioRepository = new InventarioRepository(this);
    }
}
