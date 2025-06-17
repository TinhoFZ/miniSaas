package main;
//O import é necessário porque estão em pacotes diferentes	
import usuarios.UsuariosForm;
import usuarios.UsuariosList;

public class Main {
    public static void main(String[] args) {
        UsuariosForm form = new UsuariosForm();
        UsuariosList list = new UsuariosList();

        // Usuário vai cadastrar pela primeira vez e então o código vai continuar para parte de listar
        form.cadastrarUsuario(); 
        list.listarUsuarios(form); 
    }
}