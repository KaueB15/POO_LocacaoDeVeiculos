package br.edu.fescfafic.LocacaoDeVeiculos.Interfaces;

import java.util.ArrayList;

public interface IController<T> {
    boolean remover(String placa);
    String atualizar(String placa);
    void adicionar(T veiculo);
    boolean listar();
}
