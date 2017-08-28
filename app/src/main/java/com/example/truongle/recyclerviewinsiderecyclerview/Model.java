package com.example.truongle.recyclerviewinsiderecyclerview;

/**
 * Created by TruongLe on 28/08/2017.
 */

public class Model {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Model( int b, int a) {

        this.a = a;
        this.b = b;
    }
}
