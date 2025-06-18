package empresas;

import java.util.Scanner;

public class EmpresasList {
	
	public Scanner input = new Scanner(System.in);
	
	public void listarEmpresas(EmpresasForm empresa) {
		System.out.println("Informações das empresas");
        for (int i = 0; i < empresa.quantidadeEmpresas; i++) {
        	System.out.print("id: " + i);
            System.out.print(" | nome: " + empresa.nome[i]);
            System.out.print(" | cnpj: " + empresa.cnpj[i]);
            System.out.println(" | razão social: " + empresa.razao[i]);
        }

        System.out.println("O que deseja fazer? \n [1] Criar nova empresa \n [2] Editar empresa");

        try {
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1:
                    empresa.cadastrarEmpresa();
                    listarEmpresas(empresa); // Depois de cadastrar o usuário o código continua rodando
                    break;
                case 2:
                    empresa.escolherEmpresa();
                    listarEmpresas(empresa);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    listarEmpresas(empresa);
            }
        } catch (Exception e) {
            System.out.println("Insira um valor válido");
            listarEmpresas(empresa);
        }
	}

}
