import java.util.Arrays;

public class Selectionsort {
    public static void main(String[]strings){
        int[] a = {1,12,43,4,5};

        selectionsort(a.length , 0, a, a[0]);
        selectionsort(a.length , 0, a, 0);
        // selectionsort(a.length-1,0,a);
        System.out.println(Arrays.toString(a));
    }

    public static void selectionsort(int r, int c, int[]a, int max ){
        if(r==0){
            return ;
        }
        if(r>c){
            if(a[c]>max){
                selectionsort(r,c+1, a, a[c]);
            }
            else{
                selectionsort(r, c+1, a, max);
            }
        }else{
            int temp = max;
            max = a[r-1];
            a[r-1] = temp;
            selectionsort(r-1, 0, a, a[0]);
        }
    }

    // public static void selectionsort(int r, int c, int[]a, int max ){
    //     if(r==0){
    //         return ;
    //     }
    //     if(r>c){
    //         if(a[c]>a[max]){
    //             selectionsort(r,c+1, a, c);
    //         }
    //         else{
    //             selectionsort(r, c+1, a, max);
    //         }
    //     }else{
    //         int temp = a[max];
    //         a[max] = a[r-1];
    //         a[r-1] = temp;
    //         selectionsort(r-1,0,a,0);
    //     }
    // }


    public static void selectionsort(int r, int c, int[]a ){
        while(r>0){
            int max = a[c];
            while(c<r){
                if(a[c+1]>max){
                    max = a[c+1];
                }
                c++;
                a[c] = max;
            }
            r--;
        }
    }
}
