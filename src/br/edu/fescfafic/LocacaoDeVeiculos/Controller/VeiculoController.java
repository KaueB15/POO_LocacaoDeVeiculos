package br.edu.fescfafic.LocacaoDeVeiculos.Controller;

import br.edu.fescfafic.LocacaoDeVeiculos.Dao.VeiculosDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.VeiculoNaoEncontradoException;
import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IController;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Veiculo;

import java.util.ArrayList;

public class VeiculoController implements IController<Veiculo> {
    private VeiculosDao dao = new VeiculosDao();


    @Override
    public void remover(String placa) {
        boolean encontrado = false;
        try {
            for (Veiculo veiculo : dao.listaVeiculos) {
                if (veiculo.getPlacaDoVeiculo().equals(placa)) {
                    dao.remover(veiculo);
                    System.out.println("Veiculo Removido com sucesso");
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                throw new VeiculoNaoEncontradoException();
            }
        }catch (VeiculoNaoEncontradoException e) {
            System.err.println(e);
        }
    }

    @Override
    public void adicionar(Veiculo veiculo) {
        dao.adicionar(veiculo);
        System.out.println("Veiculo adicionado");
    }

    @Override
    public String listar() {
        boolean encontrado = false;
        try{
            for(Veiculo veiculo : dao.listaVeiculos){
                if(veiculo != null){
                    return veiculo.toString();
                }
            }
            if(!encontrado){
                throw new VeiculoNaoEncontradoException();
            }
        }catch(VeiculoNaoEncontradoException e){
           System.err.println(e);
        }
        return "";
    }
}
