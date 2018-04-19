package packagee;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[0];
        System.out.println("Test");
        arr = ENums.enumarators(new int[] {1,2,3}, new int[] {4,5,6});
        for (int i:arr) {
            System.out.print(i+" ");
        }

    }

}
