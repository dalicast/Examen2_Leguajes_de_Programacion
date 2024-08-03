package hn.unah.lenguajes.creditos.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.creditos.repositorios.ClienteRepositorio;
import hn.unah.lenguajes.creditos.repositorios.PrestamosRepositorio;

@Service
public class prestamoServicio {
    @Autowired
    private PrestamosRepositorio prestamoRepositorio;

    public boolean obtenerCuota(){
        
    }
}
