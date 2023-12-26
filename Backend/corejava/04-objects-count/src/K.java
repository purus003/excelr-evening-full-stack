	
class L 

{

        static int count;

        L(){

        }

        L(int i){

        }

        L(int i, int j){

        }

        {

                count ++;

        }

        public static void main(String[] args) 

        {

                L obj1 = new L();

                L obj2 = new L();

                L obj3 = new L(20);

                L obj4 = new L();

                L obj5 = new L();

                L obj6 = new L(1, 4);

                L obj7 = new L();

                L obj8 = new L();

                L obj9 = new L();

                L obj10 = new L(7, 8);

                System.out.println(count);

        }

}

