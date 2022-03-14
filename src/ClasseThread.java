
public class ClasseThread extends Thread {
	
	private static boolean threadExistente = false;

	public void run() {

		// Se for a primeira thread, soma os valores da primeira metade do vetor
		
		if (!threadExistente) {
			
			threadExistente = true;
			for (int i = 0 ; i < ClassePrincipal.metadeDoTamanhoVetor ; i++) {
				
				ClassePrincipal.soma += ClassePrincipal.vetor[i];
				System.out.println(getName() + " adicionou " + ClassePrincipal.vetor[i] + " à soma.");
				
			}
			
		// Se for a segunda thread, soma os valores da segunda metade do vetor
			
		} else {
			
			for (int i = ClassePrincipal.metadeDoTamanhoVetor ; i < ClassePrincipal.tamanhoVetor ; i++) {
				
				ClassePrincipal.soma += ClassePrincipal.vetor[i];
				System.out.println(getName() + " adicionou " + ClassePrincipal.vetor[i] + " à soma.");
				
			}
			
		}
		
	}

}
