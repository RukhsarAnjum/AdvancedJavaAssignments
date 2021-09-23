package com.collable;
import java.util.concurrent.Callable;
public class CollableExample implements Callable{

    @Override
    public Object call() throws Exception {
        return 15;
    }
}
