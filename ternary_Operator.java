public class ternary_Operator {

        public static void main(String[] args) {

            // If-Else
            int n = 8;
            if (n % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");

            // Ternary Operator
            int s = 6;
            System.out.println(s % 2 == 0 ? "Even" : "Odd");

            // Type Conversion
            int i = 130;
            byte b = (byte) i;
            System.out.println(b);
        }
    }

    /*public static void main(String[] args) {
        int n =8;
        if (n%2==0)
            System.out.println("even");
        else
            System.out.println("odd");



    }
}

     public static void  main(String[] args) {
        int s=6;
         System.out.println(s%2==0?"even":"odd");



}
//TYPE CONVERSION
     public static void main(String[] args) {
        int i=130;
        byte b =(byte) i;
        System.out.println(b);
     }*/