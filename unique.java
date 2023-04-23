public class unique {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int[] result = findUniqueElementIndex(arr);
        if (result[0] != -1) {
            System.out.println("Unique element is " + result[0] + " at index " + result[1]);
        } else {
            System.out.println("There is no unique element in the array");
        }
    }

    public static int[] findUniqueElementIndex(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i += 2) {
            if (arr[i] != arr[i+1]) {
                return new int[] {arr[i], i};
            }
        }
        return new int[] {-1, -1};
    }
}
