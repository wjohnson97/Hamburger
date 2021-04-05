import java.text.DecimalFormat;
import java.util.Scanner;

public class HamburgerTest {

   public static void main(String[] args)
   {

// This object will be used to format the double to two decimal places.
       DecimalFormat df=new DecimalFormat("#.##");
       String stantdardToppingList[];
       String standardSauceList[];
       String cheeseToppingList[];
       String delauxToppingList[];

// To read from Keyboard
       Scanner sc=new Scanner(System.in);
       Scanner sc1=new Scanner(System.in);
       Scanner sc2=new Scanner(System.in);
       Scanner sc3=new Scanner(System.in);
       Scanner sc4=new Scanner(System.in);
       Scanner sc5=new Scanner(System.in);
       System.out.println("=========================Hamburger===================");
       System.out.println("\n");
       System.out.print("Select The type of meet from (beef, turkey, veggie)::");
       String meatType=sc.next();
      
       System.out.print("No Of Patties(1 (or) 2 (or) 3)::");
       int numberOfPatties=sc1.nextInt();
      
       System.out.print(" The cost of the buger ($11.29 for 1 patty) , cost for extra patty $2.95::");
       double cost=sc.nextDouble();
      
       System.out.println("*Type of bread: Kaiser/regular, sesame-seed, whole-wheat, white, or potato-roll *");
      
       System.out.print("Enter Type of bread:");
       String breadType=sc.next();
      
      
       System.out.println("* Standard Toppings-tomato, lettuce, pickle, onion. *");
       System.out.print("No of standard toppings ::");
       int counterT=sc.nextInt();
       stantdardToppingList=new String[counterT];
       for(int i=0;i<counterT;i++)
       {
           System.out.print("Enter Name of Standard Topping "+(i+1)+"::");
           stantdardToppingList[i]=sc2.nextLine();  
       }
      
       System.out.println(" *standardSauceList: ketchup, yellow mustard, honey mustard, spicy brown mustard, mayonnaise, chipotle mayonnaise, or BBQ* ");
       System.out.print("No of number of standard sauces ::");
       int counterS=sc.nextInt();
       standardSauceList=new String[counterS];
       for(int i=0;i<counterS;i++)
       {
           System.out.print("Enter Name of standard sauces "+(i+1)+"::");
           standardSauceList[i]=sc3.nextLine();  
       }
       System.out.println("* cheeseToppingList: American, Chedder, Pepper jack, Monterey jack, Swiss or Mozzarella *");
       System.out.print("NumberOfCheeseToppings:");
       int numberOfCheeseToppings=sc.nextInt();
       cheeseToppingList=new String[numberOfCheeseToppings];
       for(int i=0;i<numberOfCheeseToppings;i++)
       {
           System.out.print("Enter Name of Cheese Toppings "+(i+1)+"::");
           cheeseToppingList[i]=sc4.nextLine();  
       }
       System.out.print("Enter cost Of Cheese Topping(1.00 $)per Toping:");
       double costOfCheeseTopping=sc1.nextDouble();
       System.out.println("* delauxToppingList:(red onions, bacon, banana peppers, and jalapenos) *");
       System.out.print("The number of delaux toppings::");
       int counterD=sc.nextInt();
   delauxToppingList=new String[counterD];
       for(int i=0;i<counterD;i++)
       {
           System.out.print("Enter Name of delaux Toppings "+(i+1)+"::");
           delauxToppingList[i]=sc5.nextLine();  
       }
       System.out.println("* costOfDeluxe Topping: Cost is $1.25 for each *");
       System.out.print("Enter Cost of Delux Topping:");
       double costOfDeluxe=sc.nextDouble();
       Hamburger h=new Hamburger(numberOfPatties, meatType, costOfDeluxe, breadType, stantdardToppingList, counterT, standardSauceList, counterS, cheeseToppingList, numberOfCheeseToppings, costOfCheeseTopping, delauxToppingList, counterD, costOfDeluxe);
       double itemTotal=h.getCost()+h.getCostOfCheeseTopping()+h.getCostOfDeluxe();
       double subtotal=itemTotal*(8.625/100);
       double grandTotal=itemTotal+subtotal;
       System.out.println("\n");
       System.out.println(h.toString());
       System.out.println("\n");
       System.out.println("Cost of Hamburger is:"+df.format(itemTotal)+" $");
       System.out.println("Tax @ 8.625 is:"+df.format(subtotal)+" $");
       System.out.println("Grand Total:"+df.format(grandTotal)+" $");
  
   }

}