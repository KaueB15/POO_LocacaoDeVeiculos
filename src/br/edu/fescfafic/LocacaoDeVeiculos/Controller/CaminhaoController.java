package br.edu.fescfafic.LocacaoDeVeiculos.Controller;

import br.edu.fescfafic.LocacaoDeVeiculos.Dao.CaminhaoDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.NaoPossuiVeiculoException;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.PlacaJaExistenteException;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.VeiculoNaoEncontradoException;
import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IController;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Caminhao;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Carro;

import java.util.Scanner;

public class CaminhaoController implements IController<Caminhao> {
    private CaminhaoDao dao = new CaminhaoDao();

    @Override
    public void remover(String placa) {
        try {
            for (Caminhao veiculo : dao.listaCaminhao) {
                if (veiculo.getPlacaDoVeiculo().equals(placa)) {
                    dao.remover(veiculo);
                    System.out.println("Veiculo Removido com sucesso");
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
            for(Caminhao veiculo : dao.listaCaminhao){
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
    public void adicionar(Caminhao veiculo) {
        try {
            for(Caminhao caminhao : dao.listaCaminhao) {
                if (caminhao.getPlacaDoVeiculo().equals(veiculo.getPlacaDoVeiculo())){
                    throw new PlacaJaExistenteException();
                }
            }
            dao.adicionar(veiculo);
            System.out.println("Veiculo adicionado");
        }catch (PlacaJaExistenteException e){
            System.err.println(e);
        }
    }

    @Override
    public boolean listar() {
        try{
            for(Caminhao veiculo : dao.listaCaminhao){
                if(veiculo != null){
                    System.out.println("=".repeat(40));
                    System.out.println("Placa - " + veiculo.getPlacaDoVeiculo());
                    System.out.println("Marca - " + veiculo.getMarcaDoVeiculo());
                    System.out.println("Modelo - " + veiculo.getModeloDoVeiculo());
                    System.out.println("Ano - " + veiculo.getAnoDoVeiculo());
                    System.out.println("Combustivel - " + veiculo.getCombustivelUsado());
                    System.out.println("=".repeat(40));
                    return true;
                }
            }
            throw new NaoPossuiVeiculoException();
        }catch(NaoPossuiVeiculoException e){
            System.err.println(e);
        }
        return false;
    }
}
