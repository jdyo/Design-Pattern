package Decorator;

import java.io.IOException;

/**
 * @description:/*装饰实现类（FilterInputStream）
 * 一定是继承或实现原始接口(InputStream)的，内部有包含一个原始接口的超类(其实就是某个默认目标实现类)
Decorator
 * @Author: jdyo
 * @date: 2018/5/5-20:25
 */
public class FilterInputStream extends InputStream{
    /**
     * The input stream to be filtered.
     */
    protected volatile InputStream in;

    protected FilterInputStream(InputStream in) {
        this.in = in;
    }
    @Override
    public void close() throws IOException {

    }
}
