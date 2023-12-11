package br.edu.fescfafic.LocacaoDeVeiculos.Controller;

import br.edu.fescfafic.LocacaoDeVeiculos.Dao.ClientesDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.ClienteJaCadastradoException;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.PlacaJaExistenteException;
import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IController;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Users.Cliente;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Carro;

public class ClientesController implements IController<Cliente> {

    public ClientesDao dao = new ClientesDao();
    @Override
    public boolean remover(String placa) {
        return false;
    }

    @Override
    public String atualizar(String placa) {
        return null;
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
        return false;
    }
}
