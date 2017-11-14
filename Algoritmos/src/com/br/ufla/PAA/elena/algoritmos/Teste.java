package com.br.ufla.PAA.elena.algoritmos;

import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {
		RadixSort radix = new RadixSort();
		CountingSort counting = new CountingSort();
		BucketSort bucket = new BucketSort();
		int[] vetor = { 2, 5, 3, 0, 2, 3, 0, 3 };
		radix.radixsort(vetor, 8, 5);
		System.out.println("Radix Sort" + Arrays.toString(vetor));
		counting.ordenacountingSort(vetor, 5);
		System.out.println("Counting Sort" + Arrays.toString(vetor));
		bucket.bucketSort(vetor,5);
		System.out.println("Bucket Sort" + Arrays.toString(vetor));
	}

}
