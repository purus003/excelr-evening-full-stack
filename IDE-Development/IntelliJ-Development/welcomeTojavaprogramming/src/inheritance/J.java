package inheritance;

import com.sun.javafx.iio.common.ImageLoaderImpl;

class GGG {
    static void test1()
    {
        System.out.println("from test1()");
    }
}
class H extends GGG{
   static  void test2()
    {
        System.out.println("from test2()");
    }
}
class I extends H{
     static void test3()
    {
        System.out.println("from test3()");
    }
}
class J extends I{
     static void test4()
    {
        System.out.println(" from test4");
    }

    public static void main(String[] args) {
        J obj = new J();
        obj.test1();
        obj.test2();
        obj.test3();
        obj.test4();
        System.out.println("-------");
        J.test1();
        J.test2();
        J.test3();
        J.test4();
        System.out.println("done");
    }
}