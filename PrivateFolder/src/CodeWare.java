import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CodeWare {
    public static void main(String[] args) {

        int [] result2 = largest(2, new int[]{1, 2, 3, 4, 5, 6});//length [6]
        System.out.println(Arrays.toString(result2));

       int [] result3 = new int[]{find3(new int[]{3, 5, 7, 9, 2})};
        System.out.println(Arrays.toString(result3));

    }

    public static int [] largest (int n, int[] arr){
        Arrays.sort(arr);//Ascending order
        int[] result = new int[n];//defined new Array size
        int j = 0; //Index Number of New Array;

        for (int i = arr.length-1; i>= arr.length-n; i--) { //7-1= 6 index; 7-2 = 4
            result[j]=arr[i];
            j++;  //increasing index by 1;
        }
        Arrays.sort(result);
        return result;
    }
    public static int find (int [] integers) {
        int oddCount = 0;
        int oddIndex = 0;
        int evenCount = 0;
        int evenIndex = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
                evenIndex = i;
            } else {
                oddCount++;
                oddIndex = i;
            }
        }

        if (oddCount == 1) {
            return integers[oddIndex];
        } else {
            return integers[evenIndex];
        }
    }
    static int find2(int[] integers) {
        int oddcount = 0, odd = 0, evencount = 0, even = 0;
        for (int i : integers) {
            if (i % 2 == 0) {
                even = i;
                evencount++;
            } else {
                odd = i;
                oddcount++;
            }
            if (evencount > 0 && oddcount > 0) {
                if (evencount > 1) {
                    return odd;
                } else if (oddcount > 1) {
                    return even;
                }
            }
        }
        return evencount > 1 ? odd : even;
    }
    static int find3(int[] integers) {
        int[] array = Arrays.stream(integers).filter(i -> i % 2 == 0).toArray();
        return array.length == 1 ? array[0] : Arrays.stream(integers).filter(i -> i % 2 != 0).findAny().getAsInt();
    }
}


