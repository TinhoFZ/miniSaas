package usuarios;

import java.util.Scanner;

public class UsuariosForm {
    public Scanner input = new Scanner(System.in);
    public String[] nome = new String[10], senha = new String[10], email = new String[10];
    public int quantidadeUsuarios = 0, escolhaId;

    public void cadastrarUsuario() {
        System.out.println("Qual o nome?");
        nome[quantidadeUsuarios] = input.nextLine();

        System.out.println("Qual o email?");
        email[quantidadeUsuarios] = input.nextLine();

        System.out.println("Qual a senha?");
        senha[quantidadeUsuarios] = input.nextLine();

        quantidadeUsuarios++;
    }

    public void escolherUsuario() /* Escolhe qual usuário editar */ {
    	
    	try {
	    	System.out.println("Que usuário deseja modificar (id)?");
	    	escolhaId = input.nextInt();
	    	input.nextLine();
	
	    	if (escolhaId > quantidadeUsuarios) {
	    		System.out.println("Esse usuário não existe");
	    	} else {
	    		editarUsuario();
	    	}
    	} catch (Exception e) {
    		System.out.println("Insira um valor válido");
    	}
    }
    
    public void editarUsuario() /* Muda informações do usuário cadastrado */ {
    	
    	
	    System.out.println("Qual o nome?");
	    nome[escolhaId] = input.nextLine();
	
	    System.out.println("Qual o email?");
	    email[escolhaId] = input.nextLine();
	
	    System.out.println("Qual a senha?");
	    senha[escolhaId] = input.nextLine();
    }
}