import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double card1Amount, card2Amount, card3Amount, card1Limit, card2Limit, card3Limit;
        double[][] cards = new double[3][2];
        boolean start = true;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to my credit utilisation checker!!");
        System.out.println("To ensure the accuracy of the results please ensure that you type in all values correctly");
        while(start){
            System.out.println("Please y to continue");
            String starting = inputScanner.nextLine();
            start = ((starting.equals("Y"))||(starting.equals("y")))?false:true;
        }

        //Card1 input both amount spent and limit
        System.out.println("Insert Card1 amount spent");
        try {
            card1Amount = Double.parseDouble(inputScanner.nextLine());
        }
        catch (Exception e){
            card1Amount = 0;
        }
        System.out.println("Insert Card2 total limit");
        try{
            card1Limit = Double.parseDouble(inputScanner.nextLine());
        }
        catch (Exception e){
            card1Limit = 0;
        }
        cards[0][0] = card1Amount;
        cards[0][1] = card1Limit;

        //Card2 input both amount spent and limit
        System.out.println("Insert Card2 amount spent (Insert 0 if not present)");
        try{
            card2Amount = Double.parseDouble(inputScanner.nextLine());
        }
        catch (Exception e){
            card2Amount = 0;
        }
        System.out.println("Insert Card2 total limit (Insert 0 if not present)");
        try{
            card2Limit = Double.parseDouble(inputScanner.nextLine());
        }
        catch (Exception e){
            card2Limit = 0;
        }
        cards[1][0] = card2Amount;
        cards[1][1] = card2Limit;

        //Card3 input both amount spent and limit
        System.out.println("Insert Card3 amount spent (Insert 0 if not present)");
        try{
            card3Amount = Double.parseDouble(inputScanner.nextLine());
        }
        catch (Exception e){
            card3Amount = 0;
        }
        System.out.println("Insert Card3 amount spent (Insert 0 if not present)");
        try{
            card3Limit = Double.parseDouble(inputScanner.nextLine());
        }
        catch (Exception e){
            card3Limit = 0;
        }
        cards[2][0] = card3Amount;
        cards[2][1] = card3Limit;

       // Calculating the values
        System.out.printf("Total utilisation rate is %.2f%%",resultCalculator(cards));

    }
    public static double resultCalculator(double[][] cards){
        double totalAmount, totalLimit, totalUtilisation;
        //Calculating the total utilisation rate
        totalAmount = cards[0][0] + cards[1][0] + cards[2][0];
        totalLimit = cards[0][1] + cards[1][1] + cards[2][1];
        try{
            totalUtilisation = (totalAmount / totalLimit)*100;
        } catch (Exception e) {
            totalUtilisation = 0.0;
        }
        return totalUtilisation;
    }
}