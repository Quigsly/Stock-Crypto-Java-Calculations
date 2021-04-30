import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.*;

/**
 * @author Supretheral/Sean Q.
 * https://github.com/Suprethreal/Stock-Crypto-Java-Calculations/
 */

public class Main {


// Calculate Percent Change of two numbers
// Current Output is -49.87531172069825 - after decif -49.87
    static class PercentageChange {

        private static DecimalFormat decif = new DecimalFormat("#.##");

            public static void main(String[] args) {

                //double perIncre,num1=20.05,num2=10.05;

                Scanner s = new Scanner(System.in);

                System.out.println("Enter Value A");
                double valA = s.nextDouble();

                System.out.println("Enter Value B:");
                double valB = s.nextDouble();

                double perIncre = ((valB - valA) / valA) * 100;
                decif.setRoundingMode(RoundingMode.DOWN);
                    System.out.println("Changed by "+decif.format(perIncre)+" %");
            }
    }



// Calculate Profit/Loss as Number diff and Percent diff based on buy/sell prices
    static class profitandLoss {

        public static void main(String args[]) {

            Scanner s= new Scanner(System.in);

            System.out.println("Enter Value A");
            double valA = s.nextDouble();

            System.out.println("Enter Value B:");
            double valB = s.nextDouble();

            double diffNum = valB-valA;
            System.out.println("diff Number: " + diffNum);

            if(valB > valA) {
                double diffPer = (valB - valA) / valA * 100;
                System.out.println("B>A diff Percent: " + diffPer);
            } else {
                double diffPer = (valA - valB) / valB * 100;
                System.out.println("B<A diff Percent: " + -diffPer);
            }

        }
    }


// Calculate # of Stocks to Buy based on price and quantity
    static class StockAmount {

        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter sharePrice");
            double sharePrice = s.nextDouble();

            System.out.println("Enter cashOut:");
            double cashOut = s.nextDouble();

            double shareAmt = cashOut / sharePrice;
            System.out.println("Share # to Buy "+ shareAmt);
        }
    }


// Calculate how much Cash needed to put out based on stock price and quantity
    static class StockCash {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            System.out.println("Enter sharePrice");
            double sharePrice = s.nextDouble();

            System.out.println("Enter shareAmnt:");
            double shareAmnt = s.nextDouble();

            double cashOut = sharePrice * shareAmnt;
            System.out.println("Cash amount needed "+ cashOut);
        }
    }




}
