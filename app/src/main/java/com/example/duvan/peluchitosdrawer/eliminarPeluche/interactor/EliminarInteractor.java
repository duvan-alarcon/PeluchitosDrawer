package com.example.duvan.peluchitosdrawer.eliminarPeluche.interactor;

import com.example.duvan.peluchitosdrawer.eliminarPeluche.presenter.IEliminarPresenter;
import com.example.duvan.peluchitosdrawer.eliminarPeluche.repository.EliminarRepository;
import com.example.duvan.peluchitosdrawer.eliminarPeluche.repository.IEliminarRepository;

public class EliminarInteractor implements IEliminarInteractor {

    private IEliminarPresenter eliminarPresenter;
    private IEliminarRepository eliminarRepository;

    public EliminarInteractor(IEliminarPresenter eliminarPresenter) {
        this.eliminarPresenter = eliminarPresenter;
        eliminarRepository = new EliminarRepository(this);
    }

    @Override
    public void eliminarDatos(String nombre) {
        if (nombre.equals("")){
           eliminarPresenter.eliminarError("El dato requerido no existe");
        }else{
            eliminarRepository.eliminarContacto(nombre);
        }
    }
}
