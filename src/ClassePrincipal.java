
public class ClassePrincipal {
	
	public static int[] vetor = new int[100];
	public static int soma = 0;
	public static int tamanhoVetor = ClassePrincipal.vetor.length;
	public static int metadeDoTamanhoVetor = ClassePrincipal.vetor.length / 2;
	
	public static void main(String[] args) throws InterruptedException {
		
		// Preenche vetor com valores inteiros de 1 a 100
		
		for (int i = 1; i <= tamanhoVetor ; i++) {
			
			vetor[i -1] = i;
			
		}
		
		// Cria 2 threads que vão somar os valores do vetor, cada uma somando os valores de uma metade
		
		ClasseThread thread1 = new ClasseThread();
		thread1.start();
		ClasseThread thread2 = new ClasseThread();
		thread2.start();
		
		// Espera as threads terminarem suas execuções
		
		thread1.join();
		thread2.join();
		
		// Exibe soma total
		
		System.out.println("A soma total dos valores do vetor é " + soma + ".");
		
	}

}
