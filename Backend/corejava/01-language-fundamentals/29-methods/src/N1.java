class N1  

{

        public static void main(String[] args) 

        {

                int i = 1;

                int j = test1(i++, true)  +  i   +  test1(++i, true)   +  i    +  test1(i++, false)  +  i  +

                                test2(i++, false)  +  i   +  test2(++i, false)   +  i    +  test2(i++, true)  +  i;

                System.out.println(i);

                System.out.println(j);

                }

        static int test1(int i, boolean flag)

        {

                return flag ? i++ : ++i;

        }

        static int test2(int i, boolean flag)

        {

                return flag ? ++i : i++;

        }

}

