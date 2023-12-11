package br.edu.fescfafic.LocacaoDeVeiculos.Interfaces;

public interface IControllerCliente<T> {
        boolean remover(int id);
        String atualizar(int id);
        void adicionar(T cliente);
        boolean listar();
}
