package POO;

public class produtoObjeto {

		public static void main(String[] args) {
			produto som = new produto ();
					
					som.nome = "Caixa de Som";
					som.cor = "Preto";
					som.marca = "JBL";
					som.modelo = "Xtreme 3";
					som.preco = "R$1800";
					
					som.estado();
		}
}
