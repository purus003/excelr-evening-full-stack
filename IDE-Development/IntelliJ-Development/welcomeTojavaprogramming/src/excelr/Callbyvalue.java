package excelr;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Callbyvalue {
    int i;
    static void test(int i)
    {
        System.out.println("befoere test begin:" + i);
        i = 40;
        System.out.println("after test begin:" + i);

    }
    public static void main(String[] args) {
        Callbyvalue  a1 = new Callbyvalue();
        System.out.println("before main begin : " + a1.i);
        a1.i = 20;
        test(a1.i);
        System.out.println("after main end:"+a1. i);
    }
}
