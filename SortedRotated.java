import java.util.Scanner;

public class SortedRotated{
    public static int search(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right-left) / 2;

            if(arr[mid] == target) return mid;

            if(arr[left] <= arr[mid]){

                if(target >= arr[left] && target < arr[mid])
                   right = mid - 1;
                else
                   left = mid + 1;
            }
            else{
                if(target > arr[mid] && target <= arr[right])
                  left = mid + 1;
                else
                  right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int [] arr = new int [n];

        System.out.println("Enter" + n + "elements of sorted and rotated:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element to search : ");
        int target = sc.nextInt();

        int result = search(arr,target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        }else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}