package Template_Method;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-16:42
 */
public class test {
    public static void main(String[] args) {
        int[] arr = {3,5,2,45,243,341,111,543,24};
        //AbstractSort s = new MergeSort();
        AbstractSort s = new QuickSort();
        s.printArray(arr);
    }
}
