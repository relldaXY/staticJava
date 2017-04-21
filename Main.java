package blabla;

public class Main {
	
	public static void main(String[] args) {
		Teste.executaStaticTeste(); /*pra usar o metodo static de uma classe, 
		                             *nao precisa instanciar um objeto, pode-se
									 *usar o nome da classe
									*/ 
		
		Teste t1 = new Teste();
		Teste t2 = new Teste();
		
		t1.executaStaticTeste();
		System.out.println("Após executar metodo static");
		System.out.println(t1.contStaticTeste);
		System.out.println(t2.contStaticTeste);
		
		t2.executaStaticTeste();
		System.out.println("Após executar metodo static");
		System.out.println(t1.contStaticTeste);
		System.out.println(t2.contStaticTeste);
		
		/*Todos os objetos que foram instanciados utilizam   
		 * compartilham da mesma variavel static "contStaticTeste"
		 * portanto apresentam o mesmo valor(int) para esse caso
		 */
	}

}
