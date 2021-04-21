package problem_5;

public class Sort {
    static <E> void swap(E[] array, int i, int j) {
        E tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    static <E extends Comparable<E>> void bubbleSort(E[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - 1; j++)
                if (array[i].compareTo(array[j]) < 0)
                    swap(array, i, j);
    }

    static <E extends Comparable<E>> void quickSort(E[] array) {
        quickSortImplementation(array, 0, array.length - 1);
    }

    static <E extends Comparable<E>> void quickSortImplementation(E[] array, int l, int r) {
        if (l < r) {
            int pivot = partition(array, l, r);
            quickSortImplementation(array, l, pivot - 1);
            quickSortImplementation(array, pivot + 1, r);
        }
    }

    static <E extends Comparable<E>> int partition(E[] array, int l, int r) {
        int i = (l - 1);
        for (int j = l; j <= r - 1; j++) {
            if (array[j].compareTo(array[r]) < 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, r);
        return i + 1;
    }
}
