class P
{
    public static void main(String[] args)
    {
        Month p1 = Month.valueOf("JAN");
        System.out.println(p1);
        Month p2 = Month.valueOf("FEB");
        System.out.println(p2);
        Month p3 = Month.valueOf("jul");//RE(IAE)illegal argument exception
        System.out.println(p3);
    }
}