import java.util.Scanner;

public class charCheck{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char kar;
        do{
            System.out.print("masukan karakter : ");
            kar=scan.next().charAt(0);
            if(kar>='a' && kar<='z'){
                System.err.println("karakter"+kar+"termasuk huruf kecil");
            } else if(kar>='A' && kar<='Z'){
                System.err.println("karakter"+kar+"termasuk huruf kapital");
            } else if(kar>='0' && kar<='9') {
                System.err.println("karakter"+kar+"termasuk huruf kapital");
            }else{
                System.err.println("karakter"+kar+"termasuk huruf khusus");
            }
            System.out.print("mau lagi [y/n] : ");
            kar=scan.next().charAt(0);
        } while(kar=='y');
    }
}