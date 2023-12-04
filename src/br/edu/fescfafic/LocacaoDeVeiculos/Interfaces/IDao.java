package br.edu.fescfafic.LocacaoDeVeiculos.Interfaces;

import java.util.ArrayList;

public interface IDao<T> {
    void listar();
    void adicionar(T objeto);
    void remover(T veiculo);
    void atualizar(String placa);
}
