package Template_Method;

/**
 * @description:抽象模板类
 * @Author: jdyo
 * @date: 2018/5/5-16:38
 */
public abstract class AbstractSort {
    public abstract void sort(int[] array);
    //防止子类覆盖使用final修饰
    public final void printArray(int[] array) {
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
