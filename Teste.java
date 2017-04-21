package blabla;

public class Teste {
	public static int contStaticTeste = 0; 
	int contTeste = 0;
	
	public Teste(){
		
	}
	
	public static int executaStaticTeste(){  // Nao executam variaveis e metodos nao statics a nao ser que se instancie um objeto
		return contStaticTeste++;
	}
	
	public int executaTeste(){  // Metodos nao estaticos podem utilizar metodos e variaveis static 
		contStaticTeste++;
		executaStaticTeste();
		return contTeste++;
	}
	
	
}
