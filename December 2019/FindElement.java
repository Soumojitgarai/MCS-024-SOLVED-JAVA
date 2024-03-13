public class FindElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elementToFind = 5;

        if (isPresent(arr, elementToFind)) {
            System.out.println("Element " + elementToFind + " is present in the array.");
        } else {
            System.out.println("Element " + elementToFind + " is not present in the array.");
        }
    }

    public static boolean isPresent(int[] arr, int element) {
        for (int num : arr) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }
}
