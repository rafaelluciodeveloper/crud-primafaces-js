/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import DAO.ClienteDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import model.Cliente;

/**
 *
 * @author Rafael Lucio
 */
@ManagedBean
@SessionScoped
public class ClienteBean implements Serializable{
    private ClienteDAO clienteDAO;
    private Cliente cliente = new Cliente();
    private DataModel<Cliente> clientes;
 
    public void novo(){
        cliente = new Cliente();
    }
 
    public String inserir(){
        String resultado = "falha";
        clienteDAO = new ClienteDAO();
        boolean retorno = clienteDAO.inserir(cliente);
 
        if(retorno){
            resultado = "clientes";
        }
 
        return resultado;
    }
 
    public void selecionar(){
        cliente = clientes.getRowData();
    }
 
    public String alterar(){
        String resultado = "falha";
        clienteDAO = new ClienteDAO();
        boolean retorno = clienteDAO.alterar(cliente);
 
        if(retorno){
            resultado = "clientes";
        }
 
        return resultado;
    }
 
    public String remover(){
        String resultado = "falha";
        clienteDAO = new ClienteDAO();
        boolean retorno = clienteDAO.remover(cliente);
 
        if(retorno){
            resultado = "clientes";
        }
 
        return resultado;
    }
 
    public Cliente getCliente() {
        return cliente;
    }
 
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
 
    public DataModel<Cliente> getClientes() {
        clienteDAO = new ClienteDAO();
        List<Cliente> clienteList = clienteDAO.listar();
        clientes = new ListDataModel<Cliente>(clienteList);
        return clientes;
    }
 
    public void setClientes(DataModel<Cliente> clientes) {
        this.clientes = clientes;
    }
}
