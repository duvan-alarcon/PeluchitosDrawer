package com.example.duvan.peluchitosdrawer.buscarPeluche.interactor;

import com.example.duvan.peluchitosdrawer.buscarPeluche.presenter.IBuscarPresenter;
import com.example.duvan.peluchitosdrawer.buscarPeluche.repository.BuscarRepository;
import com.example.duvan.peluchitosdrawer.buscarPeluche.repository.IBuscarRepository;

public class BuscarInteractor implements IBuscarInteractor {

    private IBuscarPresenter buscarPresenter;
    private IBuscarRepository buscarRepository;

    public BuscarInteractor(IBuscarPresenter buscarPresenter) {
        this.buscarPresenter = buscarPresenter;
        buscarRepository = new BuscarRepository(this);
    }

    @Override
    public void enviarDatos(String nombre) {
        if (nombre.equals("")){
            buscarPresenter.mostrarError("Debe digitar el nombre");
        }else{
            buscarRepository.buscarContacto(nombre);
        }
    }
}
