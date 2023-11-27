package br.edu.fescfafic.LocacaoDeVeiculos.Dao;

import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Veiculo;

import java.util.ArrayList;

public class VeiculosDao implements IDao<Veiculo> {
    ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

    @Override
    public void listarTodos() {
        for(Veiculo veiculo : listaVeiculos){
            System.out.println(veiculo.getPlacaDoVeiculo());
        }
    }

    @Override
    public void adicionar(Veiculo veiculo){
        listaVeiculos.add(veiculo);
    }

    @Override
    public void remover() {

    }

    @Override
    public void buscar() {

    }
}
