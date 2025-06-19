package views;

import java.util.Scanner;

public class UsuariosForm {
	
    Scanner input = new Scanner(System.in);
    public static String[] nome = new String[255], senha = new String[255], email = new String[255], tipo = new String[255];
    public static int idUsuarios = 0, escolhaId;

    public void cadastrarUsuario() {
    	
    	try {
	        System.out.println("Qual o nome?");
	        nome[idUsuarios] = input.nextLine();
	
	        System.out.println("Qual o email?");
	        email[idUsuarios] = input.nextLine();
	
	        System.out.println("Qual a senha?");
	        senha[idUsuarios] = input.nextLine();
	        
	        System.out.println("Qual o tipo de usuário? \n [1] comum | [2] adm");
	        int escolha = input.nextInt();
	        input.nextLine();
	        
	        switch (escolha) {
	        case 1:
	        	tipo[idUsuarios] = "comum";
	        	idUsuarios++;
	        	System.out.println(idUsuarios);
	        	break;
	        case 2:
	        	tipo[idUsuarios] = "adm";
	        	idUsuarios++;
	        	break;
	        	default: 
	        		System.out.println("Opção inválida");
	        		cadastrarUsuario();
	        }
    	} catch (Exception e) {
    		System.out.println("Insira um valor válido");
    		cadastrarUsuario();
    	}
    }

    // Escolhe qual usuário editar
    public void escolherUsuario()  {
    	
    	try {
	    	System.out.println("Que usuário deseja editar (id)?");
	    	escolhaId = input.nextInt();
	    	input.nextLine();
	
	    	if (escolhaId > idUsuarios) {
	    		System.out.println("Esse usuário não existe");
	    	} else {
	    		editarUsuario();
	    	}
    	} catch (Exception e) {
    		System.out.println("Insira um valor válido");
    	}
    }
    
    // Muda informações do usuário cadastrado
    public void editarUsuario()  {
    	
    	try {
		    System.out.println("Qual o nome?");
		    nome[escolhaId] = input.nextLine();
		
		    System.out.println("Qual o email?");
		    email[escolhaId] = input.nextLine();
		
		    System.out.println("Qual a senha?");
		    senha[escolhaId] = input.nextLine();
		    
	        System.out.println("Qual o tipo de usuário? \n [1] comum | [2] adm");
	        int escolha = input.nextInt();
	        input.nextLine();
	        
	        switch (escolha) {
	        case 1:
	        	tipo[idUsuarios] = "comum";
	        	break;
	        case 2:
	        	tipo[idUsuarios] = "adm";
	        	break;
	        	default: 
	        		System.out.println("Opção inválida");
	        }
    	} catch (Exception e) {
    		System.out.println("Insira um valor válido");
    	}
    }
}