package br.edu.fescfafic.LocacaoDeVeiculos.Main;

import br.edu.fescfafic.LocacaoDeVeiculos.Controller.*;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Users.Gerente;
import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Carro;
import br.edu.fescfafic.LocacaoDeVeiculos.Util.Menus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerente gerentePrincipal = new Gerente(
                0,
                "50830482563",
                "Kauê",
                20,
                "KaueCardz",
                "kaue"
        );
        boolean rodar = true;
        int opcao;
        Scanner tecladoOpcao = new Scanner(System.in);
        Scanner tecladoTexto = new Scanner(System.in);
        Menus menus = new Menus();
        CarrosController carrosController = new CarrosController();
        MotosController motosController = new MotosController();
        OnibusController onibusController = new OnibusController();
        VansController vansController = new VansController();
        CaminhaoController caminhaoController = new CaminhaoController();


        while(rodar){
            String login;
            String senha;
            menus.menuSelecao();
            opcao = tecladoOpcao.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite o login");
                    login = tecladoTexto.nextLine();
                    System.out.println("Digite a senha");
                    senha = tecladoTexto.nextLine();
                    if(login.equals(gerentePrincipal.getLogin()) && senha.equals(gerentePrincipal.getSenha())){
                        boolean rodarMenuGerente = true;
                        int opcaoGerente;
                        while(rodarMenuGerente){
                            menus.menuEscolhaGerente();
                            opcaoGerente = tecladoOpcao.nextInt();
                            switch(opcaoGerente){
                                case 1:
                                case 2:
                                    boolean rodarVeiculo = true;
                                    int opcaoVeiculo;
                                    while(rodarVeiculo){
                                        int opcaoMenuCrud;
                                        boolean rodarMenuCrud = true;
                                        menus.menuEscolhaVeiculo();
                                        opcaoVeiculo = tecladoOpcao.nextInt();
                                        switch(opcaoVeiculo) {
                                            case 1:
                                                while (rodarMenuCrud) {
                                                    menus.menuCrud("Carro");
                                                    opcaoMenuCrud = tecladoOpcao.nextInt();
                                                    switch (opcaoMenuCrud) {
                                                        case 1:
                                                            System.out.println("Digite a Marca do Veiculo");
                                                            String marcaDoVeiculo = tecladoTexto.nextLine();
                                                            System.out.println("Digite o Modelo do Veiculo");
                                                            String modeloDoVeiculo = tecladoTexto.nextLine();
                                                            System.out.println("Digite o Ano do Veiculo");
                                                            int anoDoVeiculo = tecladoOpcao.nextInt();
                                                            System.out.println("Digite a Placa do Veiculo");
                                                            String placaDoVeiculo = tecladoTexto.nextLine();
                                                            System.out.println("Digite o Combustivel Usado no Veiculo");
                                                            String combustivelDoVeiculo = tecladoTexto.nextLine();
                                                            Carro novoCarro = new Carro(
                                                                    placaDoVeiculo,
                                                                    modeloDoVeiculo,
                                                                    anoDoVeiculo,
                                                                    combustivelDoVeiculo,
                                                                    marcaDoVeiculo
                                                            );
                                                            carrosController.adicionar(novoCarro);
                                                            break;
                                                        case 2:
                                                            System.out.println("Placa do Veiculo que quer remover");
                                                            String placaRemover = tecladoTexto.nextLine();
                                                            carrosController.remover(placaRemover);
                                                            break;
                                                        case 3:
                                                            System.out.println("Placa do Veiculo que quer atualizar");
                                                            String placaAtualizar = tecladoTexto.nextLine();
                                                            carrosController.atualizar(placaAtualizar);
                                                            break;
                                                        case 4:
                                                            carrosController.listar();
                                                            break;
                                                        case 5:
                                                            rodarMenuCrud = false;
                                                            break;
                                                        default:
                                                            System.out.println("=".repeat(40));
                                                            System.out.println("Opção invalida, tente novamente");
                                                            System.out.println("=".repeat(40) + "\n");
                                                        }
                                                    }
                                                break;
                                                case 2:
                                                    menus.menuCrud("Moto");
                                                    opcaoMenuCrud = tecladoOpcao.nextInt();
                                                    switch (opcaoMenuCrud) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        default:
                                                            System.out.println("=".repeat(40));
                                                            System.out.println("Opção invalida, tente novamente");
                                                            System.out.println("=".repeat(40) + "\n");
                                                    }
                                                    break;
                                                case 3:
                                                    menus.menuCrud("Caminhão");
                                                    opcaoMenuCrud = tecladoOpcao.nextInt();
                                                    switch (opcaoMenuCrud) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        default:
                                                            System.out.println("=".repeat(40));
                                                            System.out.println("Opção invalida, tente novamente");
                                                            System.out.println("=".repeat(40) + "\n");
                                                    }
                                                    break;
                                                case 4:
                                                    menus.menuCrud("Van");
                                                    opcaoMenuCrud = tecladoOpcao.nextInt();
                                                    switch (opcaoMenuCrud) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        default:
                                                            System.out.println("=".repeat(40));
                                                            System.out.println("Opção invalida, tente novamente");
                                                            System.out.println("=".repeat(40) + "\n");
                                                    }
                                                    break;
                                                case 5:
                                                    menus.menuCrud("Onibus");
                                                    opcaoMenuCrud = tecladoOpcao.nextInt();
                                                    switch (opcaoMenuCrud) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        default:
                                                            System.out.println("=".repeat(40));
                                                            System.out.println("Opção invalida, tente novamente");
                                                            System.out.println("=".repeat(40) + "\n");
                                                    }
                                                    break;
                                                case 6:
                                                    rodarVeiculo = false;
                                                    break;
                                                default:
                                                    System.out.println("=".repeat(40));
                                                    System.out.println("Opção invalida, tente novamente");
                                                    System.out.println("=".repeat(40) + "\n");
                                            }

                                    }
                                    break;
                                case 3:
                                    System.out.println("Deslogando...");
                                    rodarMenuGerente = false;
                                    break;
                                default:
                                    System.out.println("=".repeat(40));
                                    System.out.println("Opção invalida, tente novamente");
                                    System.out.println("=".repeat(40) + "\n");
                            }
                        }
                    }else{
                        System.out.println("Login ou senha incorretos");
                    }
                    break;
                case 2:
                    System.out.println("Sistema encerrando...");
                    rodar = false;
                    break;
                default:
                    System.out.println("=".repeat(40));
                    System.out.println("Opção invalida, tente novamente");
                    System.out.println("=".repeat(40) + "\n");
            }
        }
    }
}
