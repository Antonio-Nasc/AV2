package AV2.QUESTAO10;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		String emocao;
		
		System.out.println("Informe seu nome: ");
		nome = input.nextLine();
		
		System.out.println("Informe sua emoção com :-), :-( ou :-| ");
		emocao = input.nextLine();
		
		try {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setEmocao(emocao);
		
		} catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}

}
