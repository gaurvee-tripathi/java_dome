public class controlFlow_Statements {
    public static void main(String[] args) {
        int a = 9;
//          int b= 12;
//          if (a>b){
//              System.out.println("a is greatest");
//
//          }
//          else {
//              System.out.println("b is greatest");
//          }
//    }
//}

//        int a = 2;
//        if (a > 5) {
//            System.out.println("greater than 5");
//        } else {
//            System.out.println("less than 5");
//
//
//        }
//
//    }
//}

 /*       int a = 9;
        if (a % 2 == 0) {
            System.out.println(a + "is an even no");
        } else {
            System.out.println(a + "is an odd no");
        }
    }
}*/
// Practice QUESTIONS


//leap year

        int year = 2024;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("leap year");
            } else {
                System.out.println("not a leap year");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("leap year");
            } else {
                System.out.println("not a leap year");
            }
        }
    }

}
