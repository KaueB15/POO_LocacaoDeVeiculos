package br.edu.fescfafic.LocacaoDeVeiculos.Dao;

import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.VeiculoNaoEncontradoException;
import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Veiculo;

import java.util.ArrayList;

public class VeiculosDao implements IDao<Veiculo> {
    public ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

    @Override
    public void listar() {
    }

    @Override
    public void adicionar(Veiculo veiculo){
        listaVeiculos.add(veiculo);
    }

    @Override
    public void remover(Veiculo veiculo) {
        listaVeiculos.remove(veiculo);
    }

    @Override
    public void atualizar(String placa) {

    }
}
