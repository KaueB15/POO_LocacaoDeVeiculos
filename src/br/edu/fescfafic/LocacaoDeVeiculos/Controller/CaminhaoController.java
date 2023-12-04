package br.edu.fescfafic.LocacaoDeVeiculos.Controller;

import br.edu.fescfafic.LocacaoDeVeiculos.Dao.CaminhaoDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.NaoPossuiVeiculoException;
import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IController;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Caminhao;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Carro;

public class CaminhaoController implements IController<Caminhao> {
    private CaminhaoDao dao = new CaminhaoDao();

    @Override
    public void remover(String placa) {

    }

    @Override
    public String atualizar(String placa) {
        return null;
    }

    @Override
    public void adicionar(Caminhao Veiculo) {

    }

    @Override
    public String listar() {
        boolean encontrado = false;
        try{
            for(Caminhao veiculo : dao.listaCaminhao){
                if(veiculo != null){
                    return veiculo.toString();
                }
            }
            throw new NaoPossuiVeiculoException();
        }catch(NaoPossuiVeiculoException e){
            System.err.println(e);
        }
        return "";
    }
}
