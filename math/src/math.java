public class math {


        public static void main(String[] args)
        {
            System.out.println( ((5+4)-12) + "  :  " + subtract(add(5,4),12) );
            System.out.println((5*4) + " : "+ multiply(5,4) );
            System.out.println((20/4) + " : "+ divide(20,4) );
            System.out.println((20%3) + " : "+ modulo(20,3) );
        }

        private static int add(int x, int y)
        {
            int result = 0;
            for( int i=0; i < x; i = i + 1)
                result = result + 1;

            for( int i=1; i <= y; i= i + 1)
                result = result + 1;

            return result;
        }

        private static int subtract(int x, int y)
        {
            int result = add(x,0);

            for( int i=0; i < y; i = i + 1)
                result = result - 1;

            return result;
        }
        private static int multiply(int x, int y)
        {
            int result =0;
            for(int i=0; i<y; i++)
                result= result + x;

                return result;

        }
        private static int divide(int x, int y){

                int result = x;
                int counter = 0;
                for (int i = 0; result >= y; i++){
                    counter++;
                result = result - y;}

            return counter;

        }
        private static int modulo(int x, int y){

            int result = x;
            int counter = 0;
            for (int i = 0; result >= y; i++){
                counter++;
                result = result - y;}

            return result;


        }




}
