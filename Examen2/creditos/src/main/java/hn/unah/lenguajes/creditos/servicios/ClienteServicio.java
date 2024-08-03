package hn.unah.lenguajes.creditos.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.creditos.modelos.Cliente;
import hn.unah.lenguajes.creditos.repositorios.ClienteRepositorio;

@Service
public class ClienteServicio {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public Cliente crearCliente(Cliente nvoCliente){

        return this.clienteRepositorio.save(nvoCliente);
        
    }

    public boolean buscarPorIdentidad(String identidad){
        return this.clienteRepositorio.existsById(identidad);
    }

}
