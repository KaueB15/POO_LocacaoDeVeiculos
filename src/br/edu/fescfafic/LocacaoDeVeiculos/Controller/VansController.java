package br.edu.fescfafic.LocacaoDeVeiculos.Controller;

import br.edu.fescfafic.LocacaoDeVeiculos.Dao.VansDao;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.NaoPossuiVeiculoException;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.PlacaJaExistenteException;
import br.edu.fescfafic.LocacaoDeVeiculos.Exceptions.VeiculoNaoEncontradoException;
import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IController;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Van;

import java.util.Scanner;

public class VansController implements IController<Van> {

    public VansDao dao = new VansDao();

    @Override
    public boolean remover(String placa) {
        try {
            for (Van veiculo : dao.listaVans) {
                if (veiculo.getPlacaDoVeiculo().equals(placa)) {
                    dao.remover(veiculo);
                    System.out.println("Veiculo Removido com sucesso");
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
    public String atualizar(String placa) {
        Scanner teclado = new Scanner(System.in);
        String marcaNova;
        String modeloNovo;
        String combustivelNovo;
        boolean alugado;
        String pessoaQueAlugou;
        int anoNovo;
        try{
            for(Van veiculo : dao.listaVans){
                if (veiculo.getPlacaDoVeiculo().equals(placa)){
                    System.out.println("- Nova marca do veiculo -");
                    marcaNova = teclado.nextLine();
                    System.out.println("- Novo modelo do veiculo -");
                    modeloNovo = teclado.nextLine();
                    System.out.println("- Novo combustivel do veiculo -");
                    combustivelNovo = teclado.nextLine();
                    System.out.println("- Está alugado -");
                    alugado = teclado.nextBoolean();
                    System.out.println("- Quem alugou o veiculo -");
                    pessoaQueAlugou = teclado.nextLine();
                    System.out.println("- Novo ano do veiculo -");
                    anoNovo = teclado.nextInt();

                    veiculo.setMarcaDoVeiculo(marcaNova);
                    veiculo.setModeloDoVeiculo(modeloNovo);
                    veiculo.setCombustivelUsado(combustivelNovo);
                    veiculo.setAnoDoVeiculo(anoNovo);
                    veiculo.setAlugado(alugado);
                    veiculo.setPessoaQueAlugou(pessoaQueAlugou);
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
    public void adicionar(Van veiculo) {
        try {
            for(Van van : dao.listaVans) {
                if (van.getPlacaDoVeiculo().equals(veiculo.getPlacaDoVeiculo())){
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
            for(Van veiculo : dao.listaVans){
                if(veiculo != null){
                    System.out.println("=".repeat(40));
                    System.out.println("Placa - " + veiculo.getPlacaDoVeiculo());
                    System.out.println("Marca - " + veiculo.getMarcaDoVeiculo());
                    System.out.println("Modelo - " + veiculo.getModeloDoVeiculo());
                    System.out.println("Ano - " + veiculo.getAnoDoVeiculo());
                    System.out.println("Combustivel - " + veiculo.getCombustivelUsado());
                    System.out.println("Alugado - " + veiculo.getAlugado());
                    System.out.println("Pessoa que alugou - " + veiculo.getPessoaQueAlugou());
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
