package AV2.QUESTAO10;

public class Funcionario {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmocao(String emocao) {
		switch(emocao) {
		case ":-)":
			System.out.println("Seu humor est� divertido");
			break;
		case ":-(":
			System.out.println("Seu humor est� chateado");
			break;
			
		case ":-|":
			System.out.println("Humor neutro");
			break;
		default:
			System.out.println("Humor n�o encontrado");
		}
		
	}
	

}
