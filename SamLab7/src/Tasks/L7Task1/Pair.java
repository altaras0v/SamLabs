package Tasks.L7Task1;

import java.util.ArrayList;
import java.util.List;

public class Pair<A, B> {


    private A a;
    private B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getFirst() { return a; }
    public B getSecond() { return b; }

    public static <A, B> Pair<A, B> add(A a, B b) {
        return new Pair<>(a, b); }
}