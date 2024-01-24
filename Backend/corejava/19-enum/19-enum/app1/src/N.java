class N
{
    public static void main(String[] args)
    {
        //enums contains some built-in methods.
        //values is a static method.
        //by using values we can read all the constants of enum
        Month[] all = Month.values();//it will take all constants of enum create array. 

        for(Month list : all)
        {
            System.out.println(list);
        }
		/*
        System.out.println("------------" + all);
		for(int i = 0; i < all.length; i++)
		{
			System.out.println(all[i]);
		}*/
    }
}

//values() method is a built-in and its return type is an array of the same enum type. it returns all constants of the same enum.
/*
 You can't see this method in javadoc because it's added by the compiler.

Documented in three places :

Enum Types, from The Java Tutorials
The compiler automatically adds some special methods when it creates an enum.
 For example, they have a static values method that returns an array containing
  all of the values of the enum in the order they are declared. This method is
   commonly used in combination with the for-each construct to iterate over the
  values of an enum type.
  */
