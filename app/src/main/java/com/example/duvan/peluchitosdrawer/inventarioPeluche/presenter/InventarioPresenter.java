package com.example.duvan.peluchitosdrawer.inventarioPeluche.presenter;

import com.example.duvan.peluchitosdrawer.inventarioPeluche.interactor.InventarioInteractor;
import com.example.duvan.peluchitosdrawer.inventarioPeluche.interactor.iInventarioInteractor;
import com.example.duvan.peluchitosdrawer.inventarioPeluche.view.iInventarioFragment;

public class InventarioPresenter implements iInventarioPresenter {

    private iInventarioInteractor inventarioInteractor;
    private iInventarioFragment inventarioFragment;

    public InventarioPresenter(iInventarioFragment inventarioFragment) {
        this.inventarioFragment = inventarioFragment;
        inventarioInteractor = new InventarioInteractor(this);
    }
}
