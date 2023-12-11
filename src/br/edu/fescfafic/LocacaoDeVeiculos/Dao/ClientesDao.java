package br.edu.fescfafic.LocacaoDeVeiculos.Dao;

import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Users.Cliente;

import java.util.ArrayList;

public class ClientesDao implements IDao<Cliente> {

    public ArrayList<Cliente> listaClientes = new ArrayList<>();
    @Override
    public void listar() {

    }

    @Override
    public void adicionar(Cliente objeto) {
        listaClientes.add(objeto);
    }

    @Override
    public void remover(Cliente veiculo) {
        listaClientes.remove(veiculo);
    }

    @Override
    public void atualizar(String placa) {

    }
}
