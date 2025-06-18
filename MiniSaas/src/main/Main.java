package main;
//O import é necessário porque estão em pacotes diferentes	
import usuarios.UsuariosForm;
import usuarios.UsuariosList;
import empresas.EmpresasForm;
import empresas.EmpresasList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        UsuariosForm usuForm = new UsuariosForm();
        UsuariosList usuList = new UsuariosList();
        EmpresasForm empForm = new EmpresasForm();
        EmpresasList empList = new EmpresasList();
        
        try {
	        System.out.println("O que deseja acessar? \n [1] Usuários \n [2] Empresas");
	        int escolha = input.nextInt();
	        
	        switch (escolha) {
	        // Primeiro o cadastro vai ocorrer primeira vez e então o código vai continuar para parte de listar
	        case 1:
	        	usuForm.cadastrarUsuario(); 
		        usuList.listarUsuarios(usuForm);
		        break;
	        case 2:
	        	empForm.cadastrarEmpresa();
	        	empList.listarEmpresas(empForm);
	        	break;
	        	default:
	        		System.out.println("Opção inválida");
	        }
	        
        } catch (Exception e) {
        	System.out.println("Insira um valor válido");
        }
    }
}