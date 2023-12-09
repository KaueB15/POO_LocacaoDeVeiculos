package br.edu.fescfafic.LocacaoDeVeiculos.Util;

public class Menus {
    public void menuSelecao(){
        System.out.println("=".repeat(40));
        System.out.println("Autenticação Gerente");
        System.out.println("=".repeat(40));
        System.out.println("1 - Autenticar Gerente");
        System.out.println("2 - Encerrar Sistema");
        System.out.println("=".repeat(40));
    }

    public void menuEscolhaGerente(){
        System.out.println("=".repeat(40));
        System.out.println("O Que deseja fazer");
        System.out.println("=".repeat(40));
        System.out.println("1 - Cadastrar Novo Cliente");
        System.out.println("2 - Veiculos");
        System.out.println("3 - Deslogar");
        System.out.println("=".repeat(40));
    }
    public void menuEscolhaVeiculo(){
        System.out.println("=".repeat(40));
        System.out.println("Qual veiculo desejado");
        System.out.println("=".repeat(40));
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Caminhão");
        System.out.println("4 - Van");
        System.out.println("5 - Onibus");
        System.out.println("6 - Cancelar");
        System.out.println("=".repeat(40));
    }

    public void menuCrud(String tipoVeiculo){
        System.out.println("\n"+"=".repeat(40));
        System.out.println(tipoVeiculo);
        System.out.println("=".repeat(40));
        System.out.println("1 - Cadastrar Novo");
        System.out.println("2 - Remover pela Placa");
        System.out.println("3 - Atualizar pela Placa");
        System.out.println("4 - Listar Todos");
        System.out.println("5 - Cancelar");
        System.out.println("=".repeat(40));
    }
}
