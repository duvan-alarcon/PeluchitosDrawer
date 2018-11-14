package com.example.duvan.peluchitosdrawer.agregarPeluche.presenter;

public interface IAgregarPresenter {
    void enviarDatosAgregar(int codigo, String nombre, int cantidad, int precio);

    void mostrarError(String errorMessage);


}
