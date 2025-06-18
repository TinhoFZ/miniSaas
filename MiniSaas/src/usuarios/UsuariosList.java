package usuarios;

import java.util.Scanner;

public class UsuariosList {
	
    public Scanner input = new Scanner(System.in);

    public void listarUsuarios(UsuariosForm usuario) /* Significa o mesmo que "UsuariosForm usuario = new UsuariosForm();", porém nos parâmetros do método*/ { 
    	System.out.println("Informações do usuário");
        for (int i = 0; i < usuario.quantidadeUsuarios; i++) {
        	System.out.print("id: " + i);
            System.out.print(" | nome: " + usuario.nome[i]);
            System.out.print(" | email: " + usuario.email[i]);
            System.out.print(" | senha: " + usuario.senha[i]);
            System.out.println(" | tipo: " + usuario.tipo[i]);
        }

        System.out.println("O que deseja fazer? \n [1] Cadastrar novo usuário \n [2] Editar usuário");

        try {
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1:
                    usuario.cadastrarUsuario();
                    listarUsuarios(usuario); // Depois de cadastrar o usuário o código continua rodando
                    break;
                case 2:
                    usuario.escolherUsuario();
                    listarUsuarios(usuario);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    listarUsuarios(usuario);
            }
        } catch (Exception e) {
            System.out.println("Insira um valor válido");
            listarUsuarios(usuario);
        }
    }
}