package Ipart2;

class A

{

    A()

    {

        System.out.println("A()");

    }



    {

        System.out.println("A-IIB");

    }

}

class V2

{

    public static void main(String[] args)

    {

        inheritance.A a1 = new inheritance.A();

        System.out.println("----------");

        inheritance.A a2 = new inheritance.A();

    }

}
