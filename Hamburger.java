import java.util.Arrays;

public class Hamburger {
   int numberOfPatties;
   String meatType;
   double cost;
   String breadType;
   String stantdardToppingList[];
   int counterT;
   String standardSauceList[];
   int counterS;
   String cheeseToppingList[];
   int numberOfCheeseToppings;
   double costOfCheeseTopping;
   String delauxToppingList[];
   int counterD;
   double costOfDeluxe;
  
  
  
   public double getNumberOfPatties() {
   return numberOfPatties;
   }
   public void setNumberOfPatties(int numberOfPatties) {
   this.numberOfPatties = numberOfPatties;
   }
   public String getMeatType() {
   return meatType;
   }
   public void setMeatType(String meatType) {
   this.meatType = meatType;
   }
   public double getCost() {
   return cost;
   }
   public void setCost(double cost) {
   this.cost = cost;
   }
   public String getBreadType() {
   return breadType;
   }
   public void setBreadType(String breadType) {
   this.breadType = breadType;
   }
   public String[] getStantdardToppingList() {
   return stantdardToppingList;
   }
   public void setStantdardToppingList(String[] stantdardToppingList) {
   this.stantdardToppingList = stantdardToppingList;
   }
   public int getCounterT() {
   return counterT;
   }
   public void setCounterT(int counterT) {
   this.counterT = counterT;
   }
   public String[] getStandardSauceList() {
   return standardSauceList;
   }
   public void setStandardSauceList(String[] standardSauceList) {
   this.standardSauceList = standardSauceList;
   }
   public int getCounterS() {
   return counterS;
   }
   public void setCounterS(int counterS) {
   this.counterS = counterS;
   }
   public String[] getCheeseToppingList() {
   return cheeseToppingList;
   }
   public void setCheeseToppingList(String[] cheeseToppingList) {
   this.cheeseToppingList = cheeseToppingList;
   }
   public int getNumberOfCheeseToppings() {
   return numberOfCheeseToppings;
   }
   public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
   this.numberOfCheeseToppings = numberOfCheeseToppings;
   }
   public double getCostOfCheeseTopping() {
   return costOfCheeseTopping;
   }
   public void setCostOfCheeseTopping(int costOfCheeseTopping) {
   this.costOfCheeseTopping = costOfCheeseTopping;
   }
   public String[] getDelauxToppingList() {
   return delauxToppingList;
   }
   public void setDelauxToppingList(String[] delauxToppingList) {
   this.delauxToppingList = delauxToppingList;
   }
   public int getCounterD() {
   return counterD;
   }
   public void setCounterD(int counterD) {
   this.counterD = counterD;
   }
   public double getCostOfDeluxe() {
   return costOfDeluxe;
   }
   public void setCostOfDeluxe(int costOfDeluxe) {
   this.costOfDeluxe = costOfDeluxe;
   }
   public Hamburger() {
   numberOfPatties=1;
   meatType="beef";
   breadType="sesame-seed";
   }
   public Hamburger(int numberOfPatties, String meatType, double cost,
           String breadType, String[] stantdardToppingList, int counterT,
           String[] standardSauceList, int counterS,
           String[] cheeseToppingList, int numberOfCheeseToppings,
           double costOfCheeseTopping, String[] delauxToppingList, int counterD,
           Double costOfDeluxe) {
       super();
       this.meatType = meatType;
      
       this.numberOfPatties = numberOfPatties;
       if(numberOfPatties==1)
           this.cost=11.29;
       else if(numberOfPatties==2)
           this.cost=11.29+2.95;
       else if(numberOfPatties==3)
           this.cost=11.29+2*2.95;
      
       this.breadType = breadType;
      
       this.stantdardToppingList = stantdardToppingList;
       this.counterT = counterT;
       this.standardSauceList = standardSauceList;
       this.counterS = counterS;
       this.cheeseToppingList = cheeseToppingList;
      
       this.numberOfCheeseToppings = numberOfCheeseToppings;
      
       this.costOfCheeseTopping = numberOfCheeseToppings * 1.00;
       this.delauxToppingList = delauxToppingList;
       this.counterD = counterD;
       this.costOfDeluxe = counterD * 1.25;
   }

//This method is used to display the contents of the Hamburger Object.
   @Override
   public String toString() {
       return "Hamburger [numberOfPatties=" + numberOfPatties + ", meatType="
               + meatType + ", cost=" + cost + ", breadType=" + breadType
               + ", stantdardToppingList="
               + Arrays.toString(stantdardToppingList) + ", counterT="
               + counterT + ", standardSauceList="
               + Arrays.toString(standardSauceList) + ", counterS=" + counterS
               + ", cheeseToppingList=" + Arrays.toString(cheeseToppingList)
               + ", numberOfCheeseToppings=" + numberOfCheeseToppings
               + ", costOfCheeseTopping=" + costOfCheeseTopping
               + ", delauxToppingList=" + Arrays.toString(delauxToppingList)
               + ", counterD=" + counterD + ", costOfDeluxe=" + costOfDeluxe
               + "]";
   }
  
     
}