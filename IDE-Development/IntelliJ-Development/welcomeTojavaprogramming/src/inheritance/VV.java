package inheritance;

class A1

{

    A1(int i)

    {

        System.out.println("A1(int)");

    }

}

class T1 extends A1

{

    T1(int i)

    {

        System.out.println("T(int)");

    }

    public static void main(String[] args)

    {

        T1 t1 = new T1(90);

        System.out.println("done");

    }

}