
public class Aplicacao {
	
	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria(1000);
		c.sacar(300);
		
		System.out.println(c.getSaldo());
	} 
	//PAREI EM FUNCIONAMENTO DO HASHSET

}
