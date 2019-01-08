package com.company;
import java.util.ArrayList;
import java.lang.Math;


public class HeapImplimentation {

    public ArrayList<Integer> heapArray;

    public HeapImplimentation() {
        heapArray = new ArrayList<>();
    }

    public void insert(int data) {
        this.heapArray.add(data);
        this.shiftUp();

    }

    private void shiftUp() {

        double childPosition = this.heapArray.size() - 1;
        while (childPosition > 0) {

            int child = this.heapArray.get(((int) childPosition));
            double parentPosition = getParentPosition(childPosition);
            int parent = this.heapArray.get((int) parentPosition);
            if (child > parent) {
                heapArray.set((int) parentPosition, child);
                heapArray.set((int) childPosition, parent);
                childPosition = parentPosition;

            } else {
                break;
            }
        }

    }

    private double getParentPosition(double k) {
        double parent = Math.ceil((k - 1) / 2);
        return parent;
    }

    public int delete() {
        if (heapArray.size() <= 0) {
            return 0;
        } else if (heapArray.size() == 1) {
            return this.heapArray.remove(0);
        } else {
            int hold = heapArray.get(0);
            this.heapArray.set(0, heapArray.remove(heapArray.size() - 1));
            swiftDown();
            return hold;
        }

    }


    private void shiftDown() {

        double parentPosition = 0;
        double leftChildPosition = 2 * parentPosition + 1;

        while (leftChildPosition < heapArray.size()) {

            double rightChildPosition = leftChildPosition + 1;
            if (rightChildPosition < heapArray.size()) {
                int leftChild = heapArray.get((int) leftChildPosition);
                int rightChild = heapArray.get((int) rightChildPosition);
                double maxPosition = 0;

                if (leftChild > rightChild) {
                    maxPosition = leftChildPosition;
                } else {
                    maxPosition = rightChildPosition;
                }

                int maxValue = heapArray.get((int) maxPosition);
                int parent = heapArray.get((int) parentPosition);

                if (maxValue > parent) {
                    heapArray.set((int) parentPosition, maxValue);
                    heapArray.set((int) maxPosition, parent);
                    parentPosition = maxPosition;
                    leftChildPosition = 2 * maxPosition + 1;
                } else {
                    break;
                }

            } else {
                int parent = heapArray.get((int) parentPosition);
                int child = heapArray.get((int) leftChildPosition);
                if (child > parent) {
                    heapArray.set((int) parentPosition, child);
                    heapArray.set((int) leftChildPosition, parent);
                    break;
                } else {
                    break;
                }
            }
        }

    }
    public void printHeap() {
        for (int i = 0; i < this.heapArray.size(); i++) {
            int value = this.heapArray.get(i);
            System.out.print("Element: " + value + " ");
        }
    }

    public static void main(String[] args) {
        HeapImplimentation heap = new HeapImplimentation();
        heap.insert(20);
        heap.insert(18);
        heap.insert(19);
        heap.insert(15);
        heap.insert(13);
        heap.insert(9);
        heap.insert(8);
        heap.insert(1);
        heap.insert(3);
        heap.printHeap();
        System.out.println();

        heap.delete();
        heap.printHeap();


    }


}
