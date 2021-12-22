package org.akehopen.lang3.tuple;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author akeh
 */
public class Pair<A, B> extends LinkedHashMap<String, Object> {

    private A a;
    private B b;

    private Pair() {
    }

    public static <A, B> Pair<A, B> getInstance() {
        return new Pair<>();
    }

    public static <A, B> Pair<A, B> of(A a, B b) {
        Pair<A, B> instance = getInstance();
        instance.a = a;
        instance.b = b;
        return instance;
    }

    public Map<String, Object> ofKey(String aKey, String bKey) {
        put(aKey, a);
        put(bKey, b);
        return this;
    }

    public void setA(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setB(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setLeft(A a) {
        this.setA(a);
    }

    public A getLeft() {
        return this.getA();
    }

    public void setRight(B b) {
        this.setB(b);
    }

    public B getRight() {
        return this.getB();
    }

    public void setKey(A a) {
        this.setA(a);
    }

    public A getKey() {
        return this.getA();
    }

    public void setValue(B b) {
        this.setB(b);
    }

    public B getValue() {
        return this.getB();
    }

}
