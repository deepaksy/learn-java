package arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3},{1,2,3},{1,2,3}};
        for(int[] n:numbers){
            for(int i:n){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
