package views;

import java.util.Scanner;

public class EmpresasForm {

	Scanner input = new Scanner(System.in);
	public static String[] nome = new String[255], razao = new String[255], cnpj = new String[255];
	public static int idEmpresas = 0, escolhaId;
	
	public void cadastrarEmpresa() {
		
		System.out.println("Qual o nome?");
        nome[idEmpresas] = input.nextLine();
        
        System.out.println("Qual o cnpj?");
        cnpj[idEmpresas] = input.nextLine();

        System.out.println("Qual a razão social?");
        razao[idEmpresas] = input.nextLine();
        
        idEmpresas ++;
		
	}
	
	 // Escolhe qual empresa editar
	public void escolherEmpresa() {
	    	
	    	try {
		    	System.out.println("Que empresa deseja editar (id)?");
		    	escolhaId = input.nextInt();
		    	input.nextLine();
		
		    	if (escolhaId > idEmpresas) {
		    		System.out.println("Essa empresa não existe");
		    	} else {
		    		editarEmpresa();
		    	}
	    	} catch (Exception e) {
	    		System.out.println("Insira um valor válido");
	    	}
	    }
	    
	 	// Muda informações de uma empresa já existente
	 public void editarEmpresa() {
	    	
		 try {
			 System.out.println("Qual o nome?");
			 nome[escolhaId] = input.nextLine();
			 
			 System.out.println("Qual o cnpj?");
			 cnpj[escolhaId] = input.nextLine();
			
			 System.out.println("Qual a razão social?");
			 razao[escolhaId] = input.nextLine();
		 }
		 catch (Exception e) {
		    System.out.println("Insira um valor válido");
		 }
	 }
}
