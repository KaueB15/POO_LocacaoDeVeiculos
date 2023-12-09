package br.edu.fescfafic.LocacaoDeVeiculos.Dao;

import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Onibus;

import java.util.ArrayList;

public class OnibusDao implements IDao<Onibus> {
    public ArrayList<Onibus> listaOnibus = new ArrayList<>();

    @Override
    public void listar() {

    }

    @Override
    public void adicionar(Onibus objeto) {
        listaOnibus.add(objeto);
    }

    @Override
    public void remover(Onibus veiculo) {
        listaOnibus.remove(veiculo);
    }

    @Override
    public void atualizar(String placa) {

    }
}
