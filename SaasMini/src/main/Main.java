package main;
//O import é necessário porque estão em pacotes diferentes	
import views.HomeList;

public class Main {
	public static void main(String [] args) {
		HomeList home = new HomeList();
		
		home.listarOpcoes(home);
	}
}