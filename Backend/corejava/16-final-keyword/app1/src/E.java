class E
{
    public static void main(String[] args)
    {
        final E e1 = new E();
		e1 = null;
		e1 = new E();
        System.out.println("done");
		//cannot assign a value to final variable e1
}
