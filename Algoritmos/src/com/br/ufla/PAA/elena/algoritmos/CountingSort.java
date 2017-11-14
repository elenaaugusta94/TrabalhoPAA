package com.br.ufla.PAA.elena.algoritmos;

public class CountingSort {
	public CountingSort(){}
	
	public void ordenacountingSort(int[] A, int k) {
		int n = A.length;
		int B[] = new int[n];
		int C[] = new int[k + 1];

		// Inicializa o vetor auxiliar C com 0's
		for (int i = 0; i < k; i++) {
			C[i] = 0;
		}
		// Contagem das ocorrencias de um determinado elemento i
		for (int i = 0; i < n; i++) {
			C[A[i]] += 1;
		}
		// Quantidade de valores menores ou iguais a i no vetor A
		for (int i = 1; i < k + 1; i++) {
			C[i] = C[i] + C[i - 1];
		}
		// Faz as atriibuições ao vetor B
		for (int i = n - 1; i >= 0; i--) {
			B[C[A[i]] - 1] = A[i];
			C[A[i]] = C[A[i]] - 1;
		}
		

	}
}
