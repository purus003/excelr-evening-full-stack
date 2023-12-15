class M1
{
   int i;
   M1(int k)
   {
	System.out.println("M(int)");
       i = k;
    }
    public static void main(String[] args) 
     {
     System.out.println("main begin");
        M1 obj1 = new M1(10);
       System.out.println("---------");
        M1 obj2 = new M1(50);
       System.out.println("---------");
        M1 obj3 = new M1(20);
        System.out.println("---------");
        System.out.println(obj1.i + ", " + obj2.i + "," + obj3.i);
        System.out.println("main end");
         }
}

