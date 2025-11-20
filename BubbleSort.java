import java.io.*;
import java.util.*;

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
        try {
            // 1. Leer archivo (entrada.txt)
            File file = new File("entrada.txt");
            Scanner sc = new Scanner(file);

            // 2. Guardar los números del archivo en una lista
            List<Integer> lista = new ArrayList<>();
            while (sc.hasNextInt()) {
                lista.add(sc.nextInt());
            }
            sc.close();

            // 3. Convertir lista a arreglo
            int[] arr = lista.stream().mapToInt(i -> i).toArray();

            // Mostrar antes
            System.out.println("Antes:");
            for (int num : arr) System.out.print(num + " ");

            // Ordenar
            bubbleSort(arr);

            // Mostrar después
            System.out.println("\nDespués:");
            for (int num : arr) System.out.print(num + " ");

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
        }
    }
}

