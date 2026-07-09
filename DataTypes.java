public class DataTypes {
    /* 8 primitive or in built data types
    4 are integer (byte-2**7,1byte  /short-2**15, 2bytes/int-2**31 ,4bytes/long -2**63 ,8bytes)
     Literal
     floating(double/float)
     character(char)
     boolean (true/false)decision
     */
    public static void main(String[] args) {
        char ch = 97;
        System.out.println(ch);

        for (char i = 0; i < 65535; i++) {
            System.out.print(i);

            if (i % 80 == 0) System.out.println();

        }
    }
}