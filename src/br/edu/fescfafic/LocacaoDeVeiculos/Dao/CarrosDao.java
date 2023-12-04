package br.edu.fescfafic.LocacaoDeVeiculos.Dao;

import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Carro;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Veiculo;

import java.util.ArrayList;

public class CarrosDao implements IDao<Carro> {
    public ArrayList<Carro> listaVeiculos = new ArrayList<>();

    @Override
    public void listar() {
    }

    @Override
    public void adicionar(Carro veiculo){
        listaVeiculos.add(veiculo);
    }

    @Override
    public void remover(Carro veiculo) {
        listaVeiculos.remove(veiculo);
    }

    @Override
    public void atualizar(String placa) {

    }
}
