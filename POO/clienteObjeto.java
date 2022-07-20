package POO;

public class clienteObjeto {
	
	public static void main(String[] args) {
		cliente n1 = new cliente ();
		
		n1.nome = "Maria";
		n1.genero = "Feminino";
		n1.dataNasc = "03/05/1987";
		
		n1.estado();
				
	}
}