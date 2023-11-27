package br.edu.fescfafic.LocacaoDeVeiculos.Interfaces;

public interface IDao<T> {
    void listarTodos();
    void adicionar(T objeto);
    void remover();
    void buscar();
}
