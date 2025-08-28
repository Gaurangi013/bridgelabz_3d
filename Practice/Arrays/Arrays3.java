import java.util.*;
public class Arrays3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int arr2[]= new int[n];
            System.arraycopy(arr, 0, arr2, 0, arr.length);

            for(int num:arr2){
                System.out.println(num+ " ");
            }
        }
    }
}
//copy elements from array 1 to array 2
