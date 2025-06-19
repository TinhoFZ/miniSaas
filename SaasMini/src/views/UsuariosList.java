package views;

import java.util.Scanner;

public class UsuariosList {
	UsuariosForm usuario = new UsuariosForm();
    Scanner input = new Scanner(System.in);

    public void listarUsuarios(HomeList home) { 
    	System.out.println("Informações dos usuários");
        for (int i = 0; i < UsuariosForm.idUsuarios; i++) {
        	System.out.print("id: " + i);
            System.out.print(" | nome: " + UsuariosForm.nome[i]);
            System.out.print(" | email: " + UsuariosForm.email[i]);
            System.out.print(" | senha: " + UsuariosForm.senha[i]);
            System.out.println(" | tipo: " + UsuariosForm.tipo[i]);
        }
        
        System.out.println("Quem é você (id)?");
        int escolha = input.nextInt();
        if (UsuariosForm.tipo[escolha].equals("adm")) {
        	opcoesAdm(home);
        } else {
        	opcoesComum(home);
        }
    }
        
    public void opcoesAdm(HomeList home) {
    	System.out.println("O que deseja fazer? \n [1] Cadastrar novo usuário \n [2] Editar usuário "
        		+ "\n [3] Voltar");

        try {
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1:
                    usuario.cadastrarUsuario();
                    listarUsuarios(home); // Depois de cadastrar o usuário o código continua rodando
                    break;
                case 2:
                    usuario.escolherUsuario();
                    listarUsuarios(home);
                    break;
                case 3:
                	home.listarOpcoes(home);
                default:
                    System.out.println("Opção inválida.");
                    listarUsuarios(home);
            }
        } catch (Exception e) {
            System.out.println("Insira um valor válido");
            listarUsuarios(home);
        }
    }
    
    public void opcoesComum(HomeList home) {
     	System.out.println("O que deseja fazer? \n [1] Cadastrar novo usuário \n [2] Voltar");
    	int escolha = input.nextInt();
    	input.nextLine();
    	
    	switch (escolha) {
        case 1:
            usuario.cadastrarUsuario();
            listarUsuarios(home); // Depois de cadastrar o usuário o código continua rodando
            break;
        case 2:
        	home.listarOpcoes(home);
            break;
    	}
    }
}