package views;

import java.util.Scanner;

public class ClientesList {
	
	Scanner input = new Scanner(System.in);
	ClientesForm cliente = new ClientesForm();
	public String[] nome = new String[255], cpf = new String[255], telefone = new String[255],
			email = new String[255], endereco = new String[255];
	public int idClientes = 0, escolhaId;

	public void listarClientes(HomeList home) {
		System.out.println("Informações dos clientes");
        for (int i = 0; i < ClientesForm.idClientes; i++) {
        	System.out.print("id: " + i);
        	System.out.print(" | id da empresa: " + ClientesForm.clienteEmpresaId);
            System.out.print(" | nome: " + ClientesForm.nome[i]);
            System.out.print(" | cpf: " + ClientesForm.cpf[i]);
            System.out.print(" | telefone: " + ClientesForm.telefone[i]);
            System.out.print(" | email: " + ClientesForm.email);
            System.out.println(" | endereço: " + ClientesForm.endereco);
        }
        
        System.out.println("O que deseja fazer? \n [1] Criar novo cliente \n [2] Editar cliente \n [3] Voltar");

        try {
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1:
                    cliente.cadastrarCliente();
                    listarClientes(home);
                    break;
                case 2:
                    cliente.escolherCliente();
                    listarClientes(home);
                    break;
                case 3:
                	home.listarOpcoes(home);
                default:
                    System.out.println("Opção inválida.");
                    listarClientes(home);
            }
        } catch (Exception e) {
            System.out.println("Insira um valor válido");
            listarClientes(home);
        }
	}
}