

public class Main3 {
    public static void Main3(String[] args){
System.out.println("Perimetro: " + perimeter(20, 23.5));

        System.out.println( pariDispari(2));

    }
    public static double perimeter ( double lato1, double lato2){
        return 2* (lato1 + lato2) ;
    }
    public static int pariDispari(int num){
        if(num % 2 == 0 ) {
            return 0 ;
        } else {
            return 1;
        }
    }
}