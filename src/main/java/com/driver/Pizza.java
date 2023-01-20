package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private int topping;
    boolean x;
    boolean y;
    boolean z;
    boolean b;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.x=false;
        this.y=false;
        this.z=false;
        this.b=false;
        if(isVeg){

            this.price=300;
            this.topping=70;
        }
        else{

            this.price=400;
            this.topping=120;
        }
        this.bill+="Base Price Of The Pizza: "+price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {

        if (x == false) {
            price+=80;
            x=true;
        }
    }

    public void addExtraToppings(){
      if(y==false){
          price+=topping;
          y=true;
      }

      }


    public void addTakeaway(){
       if(z==false){
           price+=20;
           z=true;
       }

    }

    public String getBill(){
       if(!b){
            if(x){
                bill+="Extra Cheese Added: "+80+"\n";
            }
            if(y){
                bill+="Extra Toppings Added: "+topping+"\n";
            }
            if(z){
                bill+="Paperbag Added: "+20+"\n";
            }
            bill+="Total Price: "+price+"\n";
           b=true;

       }
        return this.bill;
    }
}
