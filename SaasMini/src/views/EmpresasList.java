package views;

import java.util.Scanner;

public class EmpresasList {
	
	Scanner input = new Scanner(System.in);
	EmpresasForm empresa = new EmpresasForm();
	
	public void listarEmpresas(HomeList home) /* Significa o mesmo que "EmpresasForm empresa= new EmpresasForm();", porém nos parâmetros do método*/ {
		System.out.println("Informações das empresas");
        for (int i = 0; i < EmpresasForm.idEmpresas; i++) {
        	System.out.print("id: " + i);
            System.out.print(" | nome: " + EmpresasForm.nome[i]);
            System.out.print(" | cnpj: " + EmpresasForm.cnpj[i]);
            System.out.println(" | razão social: " + EmpresasForm.razao[i]);
        }

        System.out.println("O que deseja fazer? \n [1] Criar nova empresa \n [2] Editar empresa \n [3] Voltar");

        try {
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1:
                    empresa.cadastrarEmpresa();
                    listarEmpresas(home); // Depois de cadastrar o usuário o código continua rodando
                    break;
                case 2:
                    empresa.escolherEmpresa();
                    listarEmpresas(home);
                    break;
                case 3:
                	home.listarOpcoes(home);
                default:
                    System.out.println("Opção inválida.");
                    listarEmpresas(home);
            }
        } catch (Exception e) {
            System.out.println("Insira um valor válido");
            listarEmpresas(home);
        }
	}
}
