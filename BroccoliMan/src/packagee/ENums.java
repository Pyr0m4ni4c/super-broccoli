package packagee;

public class ENums {
    public static int[] enumarators(int[] arr1, int[] arr2){
        int[] resArr = new int[arr1.length+arr2.length];
        int flag, i, j;
        i = j = flag = 0;
        if(arr1.length != arr2.length){
            if(arr1.length > arr2.length) arr2 = arrayLengthEvolve(arr2, arr1.length);
            else arr1 = arrayLengthEvolve(arr1, arr2.length);
        }
        while((j+i) < arr1.length+arr2.length) {
            if (flag == 0) {
                resArr[i+j] = arr1[i];
                flag = 1;
                i++;
            }else{
                resArr[i+j] = arr2[j];
                flag = 0;
                j++;
            } 
        }
        return resArr;
    }
    private static int[] arrayLengthEvolve(int[] arr, int length){
        int[] newArr = new int[length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0)newArr[i] = arr[i];
            else newArr[i] = 0;
        }
        return newArr;
    }
}
