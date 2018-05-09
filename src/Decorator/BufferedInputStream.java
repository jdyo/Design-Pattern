package Decorator;

/**
 * @description:具体装饰类(ConcreteDecorator)
 * @Author: jdyo
 * @date: 2018/5/5-20:27
 */
public class BufferedInputStream extends FilterInputStream{
    protected BufferedInputStream(InputStream in) {
        super(in);
    }
}
