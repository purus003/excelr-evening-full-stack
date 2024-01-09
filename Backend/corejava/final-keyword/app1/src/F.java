class F
{
    public static void main(String[] args)
    {
        F f1 = new F();
        final F f2 = new F();
		f1 = f2;
		f2 = f1;// cannot assign a value to final variable f2
		f2 = null;// cannot assign a value to final variable f2
		f2 = new F();// cannot assign a value to final variable f2
        System.out.println("done");
    }
}
