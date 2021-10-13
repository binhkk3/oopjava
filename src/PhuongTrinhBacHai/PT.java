package PhuongTrinhBacHai;

public class PT {
    float a;
    float b;
    float c;

    public PT(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "PT{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
class Main {
    public static void main(String[] args) {
        PT an = new PT(2,3,5);
        System.out.println(an);
        A ab = new A(4,4,4);
        System.out.println(ab);
    }
}
class A {
    float a;
    float b;
    float c;

    public A(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
}