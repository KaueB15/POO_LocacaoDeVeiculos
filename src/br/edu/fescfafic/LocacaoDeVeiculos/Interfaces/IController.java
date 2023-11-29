package br.edu.fescfafic.LocacaoDeVeiculos.Interfaces;

import java.util.ArrayList;

public interface IController<T> {
    void remover(String placa);

    void adicionar(T Veiculo);
    String listar();
}
