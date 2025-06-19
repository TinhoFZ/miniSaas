package views;

import java.util.Scanner;

public class HomeList {
	Scanner input = new Scanner(System.in);

    UsuariosForm usuForm = new UsuariosForm();
    UsuariosList usuList = new UsuariosList();
    EmpresasForm empForm = new EmpresasForm();
    EmpresasList empList = new EmpresasList();
    ClientesForm cliForm = new ClientesForm();
    ClientesList cliList = new ClientesList();
    
	public void listarOpcoes(HomeList home) {
	    try {
		    System.out.println("O que deseja acessar? \n [1] Usuários \n [2] Empresas \n [3] Clientes");
		    int escolha = input.nextInt();
	        
	        switch (escolha) {
		    // Primeiro o cadastro vai ocorrer e então o código vai continuar para parte de listar
		    case 1:
		        usuForm.cadastrarUsuario(); 
			    usuList.listarUsuarios(home);
			    break;
		    case 2:
		        empForm.cadastrarEmpresa();
		       	empList.listarEmpresas(home);
		       	break;
		    case 3:
		    	cliForm.cadastrarCliente();
		    	cliList.listarClientes(home);
		        default:
		        	System.out.println("Opção inválida");
		    }
		        
	    } catch (Exception e) {
	        System.out.println("Insira um valor válido");
        }
	}
}