package array.ex;

public class ArrayMethod {
     static int[] go(){
        return new int[]{50,60,90,85};
    }
    public static void main(String[] args){
        int a[] = go();
        for (int i : a) {
            System.out.println(i);
        }
    }
}
