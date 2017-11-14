package com.br.ufla.PAA.elena.algoritmos;

public class RadixSort {
	public RadixSort(){}
	public void countSortForRadix(int A[], int n, int exp) {
		int B[] = new int[n]; // Vetor de saída
		int i;
		int count[] = new int[10];
		// Inicializa o vetor auxiliar C
		for (i = 0; i < n; i++)
			count[(A[i] / exp) % 10]++;

		// Contagem das ocorrências de um determinado elemento i e
		// posição atual correspondente ao dígito de saída
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Atribuilções ao vetor de saída B
		for (i = n - 1; i >= 0; i--) {
			B[count[(A[i] / exp) % 10] - 1] = A[i];
			count[(A[i] / exp) % 10]--;
		}

		// Cópia do vetor de saída para A com valores
		// ordenados conforme o dígito atual
		for (i = 0; i < n; i++) {
			A[i] = B[i];
		}

	}

	public void radixsort(int A[], int n, int k) {
		int m = k;
		// Contagem de classificadores para cada dígito.
		// O valor do expoente corresponde a 10^i
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSortForRadix(A, n, exp);
	}
}
