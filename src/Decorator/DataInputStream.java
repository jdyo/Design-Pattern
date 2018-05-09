package Decorator;

import java.io.DataInput;

/**
 * @description:具体装饰类(ConcreteDecorator)
 * @Author: jdyo
 * @date: 2018/5/5-20:31
 */
public abstract class DataInputStream extends FilterInputStream implements DataInput {
    public DataInputStream(InputStream in) {
        super(in);
    }
}
