package br.edu.fescfafic.LocacaoDeVeiculos.Controller;

import br.edu.fescfafic.LocacaoDeVeiculos.Dao.VeiculosDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.NaoPossuiVeiculoException;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.VeiculoNaoEncontradoException;
import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IController;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

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
            throw new VeiculoNaoEncontradoException();
        }catch (VeiculoNaoEncontradoException e) {
            System.err.println(e);
        }
    }

    @Override
    public String atualizar(String placa) {
        Scanner teclado = new Scanner(System.in);
        String marcaNova;
        String modeloNovo;
        String combustivelNovo;
        int anoNovo;
        try{
            for(Veiculo veiculo : dao.listaVeiculos){
                if (veiculo.getPlacaDoVeiculo().equals(placa)){
                    System.out.println("- Nova marca do veiculo -");
                    marcaNova = teclado.nextLine();
                    System.out.println("- Novo modelo do veiculo -");
                    modeloNovo = teclado.nextLine();
                    System.out.println("- Novo combustivel do veiculo -");
                    combustivelNovo = teclado.nextLine();
                    System.out.println("- Novo ano do veiculo -");
                    anoNovo = teclado.nextInt();

                    veiculo.setMarcaDoVeiculo(marcaNova);
                    veiculo.setModeloDoVeiculo(modeloNovo);
                    veiculo.setCombustivelUsado(combustivelNovo);
                    veiculo.setAnoDoVeiculo(anoNovo);
                    return "Veiculo Atualizado";
                }
            }
            throw new VeiculoNaoEncontradoException();
        }catch (VeiculoNaoEncontradoException e){
            System.err.println(e);
        }
        return "";
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
            throw new NaoPossuiVeiculoException();
        }catch(NaoPossuiVeiculoException e){
           System.err.println(e);
        }
        return "";
    }
}
