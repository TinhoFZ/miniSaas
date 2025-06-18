package empresas;

import java.util.Scanner;

public class EmpresasForm {

	public Scanner input = new Scanner(System.in);
	public String[] nome = new String[255], razao = new String[255], cnpj = new String[255];
	public int quantidadeEmpresas = 0, escolhaId;
	
	public void cadastrarEmpresa() {
		
		System.out.println("Qual o nome?");
        nome[quantidadeEmpresas] = input.nextLine();

        System.out.println("Qual a razão social?");
        razao[quantidadeEmpresas] = input.nextLine();

        System.out.println("Qual o cnpj?");
        cnpj[quantidadeEmpresas] = input.nextLine();
        
        quantidadeEmpresas ++;
		
	}
	
	 // Escolhe qual empresa editar
	public void escolherEmpresa() {
	    	
	    	try {
		    	System.out.println("Que empresa deseja editar (id)?");
		    	escolhaId = input.nextInt();
		    	input.nextLine();
		
		    	if (escolhaId > quantidadeEmpresas) {
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
			
			 System.out.println("Qual a razão social?");
			 razao[escolhaId] = input.nextLine();
			
			 System.out.println("Qual o cnpj?");
			 cnpj[escolhaId] = input.nextLine();
		 }
		 catch (Exception e) {
		    System.out.println("Insira um valor válido");
		 }
	 }
}
