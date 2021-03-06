package com.aplicacion.cliente.service;

import com.aplicacion.cliente.repositories.ClienteRepository;
import com.aplicacion.cliente.domains.Cliente;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente guardar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente actualizar(Cliente cliente){
        Cliente cli = listarCliente(cliente.getId());

        cliente.setId(cli.getId());

        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }

    public Cliente listarCliente(int id){
        return clienteRepository.findById(id);
    }

    public Cliente buscarNombre(String nombre){
        return clienteRepository.findByNombre(nombre);
    }

    public List<Cliente> buscarDireccion(String provincia){
        return clienteRepository.findByDireccion_Provincia(provincia);
    }

    public List<Cliente> buscarEstado(String estado){
        return clienteRepository.findByEstadocliente(estado);
    }

    public void eliminar(Cliente cliente){
        clienteRepository.delete(cliente);
    }

}
