package inheritance;

class A2

{

    A2()

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

        A2 a1 = new A2();

        System.out.println("----------");

        A2 a2 = new A2();

    }

}



