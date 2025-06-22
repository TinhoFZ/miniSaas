package views;

import java.util.Scanner;

public class UsuariosList {
	UsuariosForm usuario = new UsuariosForm();
    Scanner input = new Scanner(System.in);

    public void escolherAcao (HomeList home) {
    	try {
    		// Usuário vai escolher entre criar uma conta nova ou entrar em uma conta já existente
	    	System.out.println("Deseja fazer \n [1] cadastro \n [2] login \n [3] voltar?");
	    	int escolha = input.nextInt();

	    	switch (escolha) {
	    	case 1:
	    		usuario.cadastrarUsuario();
	    		escolherAcao(home);
	    		break;
	    	case 2:
	    		// Vai checar se já existe um usuário no sistema para realizar o login, se não o sistema irá gerar um aviso
	    		if (UsuariosForm.idUsuarios > 0) {
		    		usuario.loginUsuario();
		    		if (UsuariosForm.usuarioAdm == true) {
		    			opcoesAdm(home);
		    		} else if (UsuariosForm.usuarioComum == true){
		    			opcoesComum(home);
		    		}
	    		} else {
	    			System.out.println("Ainda não existe um usuário no sistema");
	    			escolherAcao(home);
	    		}
	    		break;
	    	case 3:
	    		home.listarOpcoes(home);
	    		default:
	    			System.out.println("Valor inválido");
	    	}
    	} catch (Exception e) {
    		System.out.println("Valor inserido inválido");
    	}
    }

    public void listarUsuarios() { 
    	
    	System.out.println("Informações dos usuários");
        for (int i = 0; i < UsuariosForm.idUsuarios; i++) {
        	System.out.print("id: " + i);
            System.out.print(" | nome: " + UsuariosForm.nome[i]);
            System.out.print(" | email: " + UsuariosForm.email[i]);
            System.out.print(" | senha: " + UsuariosForm.senha[i]);
            System.out.println(" | tipo: " + UsuariosForm.tipo[i]);
        }
    }

    // Mostra as opções que um adm tem no sistema
    public void opcoesAdm(HomeList home) {
    	
    	System.out.println("O que deseja fazer? \n [1] Cadastrar novo usuário \n [2] Editar usuário "
        		+ "\n [3] Ver lista de usuário \n [4] Voltar");
        try {
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1:
                    usuario.cadastrarUsuario();
                    listarUsuarios(); // Depois de cadastrar o usuário o código continua rodando
                    opcoesAdm(home);
                    break;
                case 2:
                    usuario.escolherUsuario();
                    listarUsuarios();
                    opcoesAdm(home);
                    break;
                case 3:
                	listarUsuarios();
                	opcoesAdm(home);
                	break;
                case 4:
                	escolherAcao(home);
                	opcoesAdm(home);
                	break;
                default:
                    System.out.println("Opção inválida.");
                    opcoesAdm(home);
            }
        } catch (Exception e) {
            System.out.println("Insira um valor válido");
            listarUsuarios();
        }
    }

    // Mostra as opções que um usuário comum tem no sistema
    public void opcoesComum(HomeList home) {
    	
    	try {
         	System.out.println("O que deseja fazer? \n [1] Cadastrar novo usuário \n [2] Visualizar usuários \n [3] Voltar");
        	int escolha = input.nextInt();
        	input.nextLine();

        	switch (escolha) {
            case 1:
                usuario.cadastrarUsuario();
                break;
            case 2:
            	listarUsuarios();
            	break;
            case 3:
            	escolherAcao(home);
                break;
                default:	
                	System.out.println("Insira um valor válido");
        	}
    	} catch (Exception e) {
    		System.out.println("Valor inserido inválido");
    	}
    	opcoesComum(home);
    }
}