package com.br.ufla.PAA.elena.algoritmos;

import java.util.Arrays;
import java.util.LinkedList;

public class BucketSort {	
	
	public BucketSort(){}

	public void bucketSort(int[] A, int maiorValor) {
		int numBaldes = maiorValor / 5;
		LinkedList[] B = new LinkedList[numBaldes];		
		// Inicializa a lista vazia
		for (int i = 0; i < numBaldes; i++) {
			B[i] = new LinkedList<Integer>();
		}
		// Coloca os valores no balde respectivo:
		for (int i = 0; i < A.length; i++) {
			int j = numBaldes - 1;
			while (true) {
				if (j < 0) {
					break;
				}
				if (A[i] >= (j * 5)) {
					B[j].add(A[i]);
					break;
				}
				j--;
			}
		}
		// Ordena e atualiza o vetor utilizando o algoritmo Inserção
		int indice = 0;
		for (int i = 0; i < numBaldes; i++) {
			int[] aux = new int[B[i].size()];
			// Coloca cada balde num vetor:
			for (int j = 0; j < aux.length; j++) {
				aux[j] = (Integer) B[i].get(j);
			}
			insertionSort(aux); // algoritmo escolhido para ordenação.
			// Devolve os valores ao vetor de entrada:
			for (int j = 0; j < aux.length; j++, indice++) {
				A[indice] = aux[j];
			}
		}
	}

	private static void insertionSort(int A[]) {
		int n = A.length;
		for (int i = 1; i < n; ++i) {
			int chave = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > chave) {
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = chave;
		}
	}

	
}
