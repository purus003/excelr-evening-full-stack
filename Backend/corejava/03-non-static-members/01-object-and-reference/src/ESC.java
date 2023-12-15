class S 

{

        void test()

        {

                System.out.println("test:" + this);

        }

        public static void main(String[] args) 

        {

                S s1 = new S();

                System.out.println("main:" + s1);

                s1.test();

        }

}

