public class Pizza {
    
    private int price;
    private boolean veg;
    
    private int extraCheesePrice = 3;
    private int extraToppingPrice = 4;
    private int bagPrice = 1;
    
    private int basePizzaPrice;
    
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;
    
    public Pizza(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 35;
        }else{
            this.price = 25;
        }
        basePizzaPrice = this.price;
    }
    
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
      //  System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
    
    }
    
    public void addExtraToppings(){
        isExtraToppingsAdded = true;
    //    System.out.println("Extra toppings added");
        this.price += extraToppingPrice;
    
    }
    
    public void takeAway(){
        isOptedForTakeAway = true;
     //   System.out.println("Take Away Opted");
        this.price += bagPrice;
    
    }
    
    public void getBill(){
        String bill = "";
        System.out.println("Pizza: " + "RM" + basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: " + "RM" + extraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings Added: " + "RM" + extraToppingPrice + "\n"; 
        }
        if(isOptedForTakeAway){
            bill += "Take Away: " + "RM" + bagPrice + "\n";
        }
        bill += "Total Bill: " + "RM" + this.price + "\n";
        System.out.println(bill);
    
    }
    
//    public void getPizzaPrice(){
//        System.out.println(this.price);
//    }
    
}
