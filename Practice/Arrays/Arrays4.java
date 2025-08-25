
public class Arrays4 {
    // 4.Find the sum of all elements in an array.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
