package TRAININGPACK;

/**
 * Created by dip17_000 on 29.02.2016.
 */

public class Quicksort {
    // Организовать вызов фактического метода быстрой сортировки
    static void qsort(char items[]) {
        qs(items, 0, items.length - 1);
    }

    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, у;
        i = left;
        j = right;

        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i <= j) {
                у = items[i];
                items[i] = items[j];
                items[j] = у;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) qs(items, left, j);
        if (i < right) qs(items, i, right);
    }
}
