package com.akehcloud.lang3.tuple;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author akeh
 */
public class Triple<A, B, C> extends LinkedHashMap<String, Object> {

    private A a;
    private B b;
    private C c;

    private Triple() {
    }

    public static <A, B, C> Triple<A, B, C> getInstance() {
        return new Triple<>();
    }

    public static <A, B, C> Triple<A, B, C> of(A a, B b, C c) {
        Triple<A, B, C> instance = getInstance();
        instance.a = a;
        instance.b = b;
        instance.c = c;
        return instance;
    }

    public Map<String, Object> ofKey(String aKey, String bKey, String cKey) {
        put(aKey, a);
        put(bKey, b);
        put(cKey, c);
        return this;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    public void setLeft(A left) {
        this.setA(a);
    }

    public A getLeft() {
        return this.getA();
    }

    public void setMiddle(B middle) {
        this.setB(middle);
    }

    public B getMiddle() {
        return this.getB();
    }


    public void setRight(C right) {
        this.setB(b);
    }

    public B getRight() {
        return this.getB();
    }

}
