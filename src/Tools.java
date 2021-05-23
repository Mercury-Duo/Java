import java.util.Scanner;
import java.lang.String;

public class Tools {
    private static Scanner scan=new Scanner(System.in);
    private  static Scanner scanint=new Scanner(System.in);
    public static String ReadMenuSelection(){
        String c="";
        Tools str=new Tools();
        c=str.Scan();
        return c;
    }
    public String Scan(){      //返回输入值
        return scan.nextLine();
    }
    public static int ReadMenuSelectionint(){
        int c=0;
        Tools int1=new Tools();
        c=int1.Scan1();
        return c;
    }
    public int Scan1(){ return scanint.nextInt(); }
}
