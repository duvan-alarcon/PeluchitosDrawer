package com.example.duvan.peluchitosdrawer.agregarPeluche.interactor;

import com.example.duvan.peluchitosdrawer.agregarPeluche.presenter.IAgregarPresenter;
import com.example.duvan.peluchitosdrawer.agregarPeluche.repository.AgregarRepository;
import com.example.duvan.peluchitosdrawer.agregarPeluche.repository.IAgregarRepository;

public class AgregarInteractor implements IAgregarInteractor {

    private IAgregarPresenter agregarPresenter;
    private IAgregarRepository agregarRepository;

    public AgregarInteractor(IAgregarPresenter agregarPresenter) {
        this.agregarPresenter = agregarPresenter;
        agregarRepository = new AgregarRepository(this);
    }

    @Override
    public void enviarDatosAgregar(int codigo, String nombre, int cantidad, int precio) {
        if ((String.valueOf(codigo).equals("")) || (nombre.equals("")) || (String.valueOf(cantidad).equals("")) ||
                (String.valueOf(precio).equals(""))) {
            agregarPresenter.mostrarError("Debe digitar todos los valores");
        } else {
            agregarRepository.agregarContacto(codigo, nombre, cantidad, precio);
        }
    }
}


