package br.edu.fescfafic.LocacaoDeVeiculos.Controller;

import br.edu.fescfafic.LocacaoDeVeiculos.Dao.ClientesDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.*;
import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IController;
import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IControllerCliente;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Users.Cliente;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Caminhao;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Carro;

import java.util.Scanner;

public class ClientesController implements IControllerCliente<Cliente> {

    public ClientesDao dao = new ClientesDao();
    @Override
    public boolean remover(int id) {
        try {
            for (Cliente cliente : dao.listaClientes) {
                if (cliente.getID() == id) {
                    dao.remover(cliente);
                    System.out.println("Cliente Removido com sucesso");
                    return true;
                }
            }
            throw new VeiculoNaoEncontradoException();
        }catch (VeiculoNaoEncontradoException e) {
            System.err.println(e);
        }
        return false;
    }

    @Override
    public String atualizar(int id) {
        Scanner teclado = new Scanner(System.in);
        String nomeNovo;
        try{
            for(Cliente cliente : dao.listaClientes){
                if (cliente.getID() == id){
                    System.out.println("- Nova marca do veiculo -");
                    nomeNovo = teclado.nextLine();

                    cliente.setNome(nomeNovo);
                    return "Veiculo Atualizado";
                }
            }
            throw new NaoPossuiClienteException();
        }catch (NaoPossuiVeiculoException e){
            System.err.println(e);
        }
        return "";
    }

    @Override
    public void adicionar(Cliente cadastro) {
        try {
            for(Cliente cliente : dao.listaClientes) {
                if (cliente.getID() == cadastro.getID()){
                    throw new ClienteJaCadastradoException();
                }
            }
            dao.adicionar(cadastro);
            System.out.println("Veiculo adicionado");
        }catch (ClienteJaCadastradoException e){
            System.err.println(e);
        }
    }

    @Override
    public boolean listar() {
        try{
            for(Cliente cliente : dao.listaClientes){
                if(cliente != null){
                    System.out.println("=".repeat(40));
                    System.out.println("Nome - " + cliente.getNome());
                    System.out.println("CPF - " + cliente.getCPF());
                    System.out.println("ID - " + cliente.getID());
                    System.out.println("=".repeat(40));
                    return true;
                }
            }
            throw new NaoPossuiClienteException();
        }catch(NaoPossuiClienteException e){
            System.err.println(e);
        }
        return false;
    }
}
