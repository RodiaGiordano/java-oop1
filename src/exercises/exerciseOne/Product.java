package exercises.exerciseOne;

import exercises.RandomNumb;

import java.util.Random;

public class Product {

    private int code; //random
    private String name;
    private float price;
    private int vat;

    Product(String name, float price){
        code = RandomNumb.randomNumber();
        this.name = name;
        this.price = price;
        vat = 22;
    }

    public String getCode(){
       return String.format("%06d", code);
    }

    public String getName(boolean complete){
        if(complete){
            return getCode() + "-" + name;
        }
        return name;
    }

    public float getPrice(boolean whitVat){
        if(whitVat){
            return price + (price * vat / 100);
        }
        return price;
    }

    public int getVat(){
        return vat;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setPrice(float newPrice){
        price = newPrice > 0 ? newPrice : price;
    }

    public void setVat(int newVat){
        vat = newVat > 0 ? newVat : 22;
    }

    @Override
    public String toString(){
        return "{code=" + code + ",name=" + name + ",price=" + price + ",vat=" + vat + "}";
    }

  /*  private int randomNumber(){
        Random random = new Random();

        return random.nextInt(999999) +1;
    }*/

}
