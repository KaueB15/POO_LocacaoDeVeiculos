package br.edu.fescfafic.LocacaoDeVeiculos.Dao;

import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Moto;

import java.util.ArrayList;

public class MotosDao implements IDao<Moto> {
    public ArrayList<Moto> listaMotos = new ArrayList<>();

    @Override
    public void listar() {

    }

    @Override
    public void adicionar(Moto objeto) {
        listaMotos.add(objeto);
    }

    @Override
    public void remover(Moto veiculo) {
        listaMotos.remove(veiculo);
    }

    @Override
    public void atualizar(String placa) {

    }
}
