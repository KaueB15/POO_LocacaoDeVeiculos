package br.edu.fescfafic.LocacaoDeVeiculos.Dao;

import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Van;

import java.util.ArrayList;

public class VansDao implements IDao<Van> {

    public ArrayList<Van> listaVans = new ArrayList<>();

    @Override
    public void listar() {

    }

    @Override
    public void adicionar(Van objeto) {
        listaVans.add(objeto);
    }

    @Override
    public void remover(Van veiculo) {
        listaVans.remove(veiculo);
    }

    @Override
    public void atualizar(String placa) {

    }
}
