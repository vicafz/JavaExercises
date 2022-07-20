package ex1e2;

public abstract class animal implements Intefaceanimal{
	String nome;
	int idade;
	
	@Override
	public void emitirSom() {
		System.out.println("Som de Animal...");
	}
}

