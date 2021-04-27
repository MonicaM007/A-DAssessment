package com.uos.ac.uk.ad;

public class BinaryHeap {

	/*
	 * Binary Heap (aka minimum heap) is a Binary Tree with following properties.
	 * It's a complete tree (All levels are completely filled except possibly the
	 * last level and the last level has all keys as left as possible). This
	 * property of Binary Heap makes them suitable to be stored in an array A binary
	 * heap refers to the number of child nodes, each node can have 2 parents - this
	 * is the correct way to can build the heap. A binary heap can be a minimum or
	 * maximum heap. The only difference is in which value is at the top of the
	 * heap, the smallest or the largest. Below is the coding for a Binary Heap -
	 * left and right parents with child nodes under.\
	 */
	private static void minHeap(int A[], int i, int length) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = i;
		if (left < length && A[left] < A[largest]) {
			// System.out.println("Left Parent:" + A[left]);
			largest = left;
		} else if (right < length && A[right] < A[largest]) {
			// System.out.println("Right Parent:" + A[right]);
			largest = right;
		}
		if (largest != i) {
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			minHeap(A, largest);
		}

	}

	private static char[] heap;
	private int elements;

	BinaryHeap() {
		if (this.elements > 1) {
			BinaryHeap.heap[0] = BinaryHeap.heap[this.elements - 1];
			this.elements = this.elements - 1;
			this.__minHeap(0);
			return;
		} else if (this.elements == 1) {
			this.elements = this.elements - 1;
			return;
		} else {
			return;
		}
	};

	private void __minHeap(int i) {

	}

	private static void minHeap(int[] a, int largest) {

	}

	private static void heapBuild(int A[]) {
		for (int i = 0; i < A.length; i++) {
			// System.out.println("" + i);
			minHeap(A, i, A.length);
			{
			}

		}
	}

	/*
	 * public int remove() { int small = heap[0]; int index = 0; heap[0] =
	 * heap[--index]; minHeap(null, 0); return small;
	 */

	public static void main(String[] args) {
		int A[] = new int[] { 12, 6, 79, 32, 15, 54 };
		heapBuild(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i] + ",");
		}

	}
}