package br.edu.fescfafic.LocacaoDeVeiculos.Dao;

import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Caminhao;

import java.util.ArrayList;

public class CaminhaoDao implements IDao<Caminhao> {
    public ArrayList<Caminhao> listaCaminhao = new ArrayList<>();

    @Override
    public void listar() {

    }

    @Override
    public void adicionar(Caminhao objeto) {

    }

    @Override
    public void remover(Caminhao veiculo) {

    }

    @Override
    public void atualizar(String placa) {

    }
}
