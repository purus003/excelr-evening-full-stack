class A28
{
    public static void main(String[] args)
    {
        char rows = 5;
        for (char i = 1; i<= rows  ; i++ )
        {
            for (char j = 1; j<= rows-i ; j++ )
            {
                System.out.print(" ");
            }
            for (char k = 1; k<=i ; k++ )
            {
                System.out.print((char)('A' + k - 1));
            }
            System.out.println();
        }
    }
}

