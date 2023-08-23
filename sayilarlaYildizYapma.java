import java.util.Scanner;

public class sayilarlaYildizYapma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Basamak sayısını giriniz : ");
        n = input.nextInt();

        int i =1;
        while (i<=n) {
           for(int a = 1; a<=i; a+=2){
               if(a == 1){
                   System.out.print("    * ");
               }else{
                   System.out.print("**");
               }

           }
            System.out.println("");
            i+=2;
        }
    }
}
