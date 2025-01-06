public class Insertion {
    public static void main(String[] args){
        int[] arr = {6, 5, 2, 1, 8, 9, 4, 20};
        int size = arr.length;

        System.out.print("Before sort : ");
        for (int num : arr) {
            System.out.print(num +" ");
        }

        System.out.println();

        System.out.println("---- Sorting ----");
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 &&  key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.print("After sort : ");
        for (int num : arr) {
            System.out.print(num +" ");
        }
    }
}
