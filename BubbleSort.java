public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    intercambio = true;
                }
            }
            if (!intercambio) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Antes :");
        for (int num : arr) System.out.print(num + " ");
        bubbleSort(arr);

        System.out.println("\nDespués:");
        for (int num : arr) System.out.print(num + " ");
    }
}
