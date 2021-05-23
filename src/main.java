import javax.tools.Tool;
import java.util.Scanner;
class main{
    public static void main(String args[]){
        boolean flag=true;
        String details="收支\t账户金额\t收支金额\t说   明\n";
        int base=10000;
       while(flag){
            System.out.println("------------------------------");
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("0.退出");
            System.out.print("请选择：");
            String x=Tools.ReadMenuSelection();
            switch (x){
                case "1":
                    System.out.println("--------------当前收支明细---------------------");
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("--------------本次登记收入---------------------");
                    System.out.print("本次收入金额:");
                    int money=Tools.ReadMenuSelectionint();
                    System.out.print("本次收入说明:");
                    String info=Tools.ReadMenuSelection();
                    base=base+money;
                    details+="收入"+"\t"+base+"\t"+money+"\t"+info+"\n";
                    break;
                case "3":
                    System.out.println("--------------本次登记支出---------------------");
                    System.out.print("本次支出金额:");
                    int gomoney=Tools.ReadMenuSelectionint();
                    System.out.print("本次收入说明:");
                    String goinfo=Tools.ReadMenuSelection();
                    base=base-gomoney;
                    details+="支出"+"\t"+base+"\t"+gomoney+"\t"+goinfo+"\n";
                    break;
                case "0":
                    flag=false;
                default:
                    break;
            }

        }
        }
    }