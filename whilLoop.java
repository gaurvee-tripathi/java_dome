public class whilLoop {
    public static void main(String[] args) {
        /*int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        //reverse
        int n =1234;
        int sum=0;
        while (n!=0) {
            int last_digit=n%10;
            sum=sum+last_digit;
            n=n/10;
        }
        System.out.println(sum);

        int s =1234;
        int rev=0;
        while (s!=0) {
            int last_digit=s%10;
            rev=rev*10+last_digit;
            s=s/10;
        }
        System.out.println(rev);*/

        //palindrome
        /*int p =1281;
        int reverse=0;
        int copy=p;
        while (p!=0) {
            int last_digit=p%10;
            reverse=reverse*10+last_digit;
            p=p/10;
            
        }
        p=copy;
        if (reverse==p){
        System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }*/


        //strong
        int r =145;
        int sum=0;
        int temp=r;
        while (r!=0) {
            int last_digit=r%10;
            int fact=1;
            for (int i=1;i<=last_digit;i++){
                fact= fact*i;

            }
            sum =sum+fact;
            System.out.println(fact);
            r=r/10;
            
        }
        r=temp;
        System.out.println(sum==r?"strong":"not strong");
        
        
    }

}
