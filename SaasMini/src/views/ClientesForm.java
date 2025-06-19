package views;

import java.util.Scanner;

public class ClientesForm {

	Scanner input = new Scanner(System.in);
	public static String[] nome = new String [255], cpf = new String [255], telefone = new String [255],
			email = new String [255], endereco = new String [255];
	public static int [] clienteEmpresaId = new int [255];
	public static int idClientes = 0, escolhaId;
	
	public void cadastrarCliente() {
		
		System.out.println("Qual o nome?");
        nome[idClientes] = input.nextLine();
	    
        
	        if (EmpresasForm.idEmpresas > 0) {
	        	System.out.println("Qual a empresa (id)?");
	        	clienteEmpresaId[idClientes] = input.nextInt();
	        } else {
	        	System.out.println("Infelizmente ainda não há nenhuma empresa disponível no sistema");
	        }
        
        System.out.println("Qual o cpf?");
        cpf[idClientes] = input.nextLine();

        System.out.println("Qual o telefone?");
        telefone[idClientes] = input.nextLine();
        
		System.out.println("Qual o email?");
        email[idClientes] = input.nextLine();
        
        System.out.println("Qual o endereco?");
        endereco[idClientes] = input.nextLine();
        
        idClientes ++;
	}
	
	public void escolherCliente() {
		
		try {
	    	System.out.println("Que cliente deseja editar (id)?");
	    	escolhaId = input.nextInt();
	    	input.nextLine();
	
	    	if (escolhaId > idClientes) {
	    		System.out.println("Esse cliente não existe");
	    	} else {
	    		editarCliente();
	    	}
    	} catch (Exception e) {
    		System.out.println("Insira um valor válido");
    	}
	}
	
	public void editarCliente() {
		
		System.out.println("Qual o nome?");
        nome[escolhaId] = input.nextLine();
        
        System.out.println("Qual o cpf?");
        cpf[escolhaId] = input.nextLine();

        System.out.println("Qual o telefone?");
        telefone[escolhaId] = input.nextLine();
        
		System.out.println("Qual o email?");
        email[escolhaId] = input.nextLine();
        
        System.out.println("Qual o endereco?");
        endereco[escolhaId] = input.nextLine();
	}
}
