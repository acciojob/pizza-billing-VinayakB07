package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean once;
    private boolean once1;
    private boolean once3;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        once=true;
        once1=true;
        once3=true;
        if(isVeg){
            bill="Base Price Of The Pizza: 300\n";
            price=300;
        }
        else{
            bill="Base Price Of The Pizza: 400\n";
            price=400;
        }


    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(once){
            bill+="Extra Cheese Added: 80\n";
            price+=80;
            once=false;
            }


    }

    public void addExtraToppings(){
      if(isVeg){
          if(once1){
              bill+="Extra Toppings Added: 70\n";
              price+=70;
              once1=false;
          }

      }
      else{
          if(once1){
              bill+="Extra Toppings Added: 120\n";
              price+=120;
              once1=false;
          }

      }
    }

    public void addTakeaway(){
        if(once3){
            bill+="Paperbag Added: 20\n";
            price+=20;
            once3=false;
        }

    }

    public String getBill(){
        bill+="Total Price: "+price;
        return this.bill;
    }
}
//    Base Price Of The Pizza: 300
//        Extra Cheese Added: 80
//        Extra Toppings Added: 70
//        Paperbag Added: 20
//        Total Price: 470