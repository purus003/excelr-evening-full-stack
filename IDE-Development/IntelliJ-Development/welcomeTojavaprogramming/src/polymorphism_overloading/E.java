package polymorphism_overloading;

class E {
    void test()
    {
        System.out.println("from test");
    }
    String test(int i)
    {
        System.out.println("from test(int)");
        return "abc";
    }
    String test(String str1,String str2)
    {
        System.out.println("from test(str1,str2)");
        return "dfs";
    }

    public static void main(String[] args) {
        E e1 = new E();
        e1.test();
        e1.test(10);
        e1.test("abc","bd");
    }
}
