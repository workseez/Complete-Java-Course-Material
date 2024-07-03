package com.tutorialseu.basics;

public class ProductDemo {
    public static void main(String[] args){

        Product product = new Product();

        try{
            //Sending a null productId should throw an exception as it is validated in setter Method
            product.setProductId(null);
        }catch(Exception err){
            //Printing the error to the console
            System.out.println(err.toString());
        }

        try{
            //Now let's try with correct productId format
            product.setProductId("1234");
        }catch(Exception err){
            System.out.println(err.toString());
        }

        try{
            //Sending a negative product price should throw an error as it is validated in setter Method
            product.setPrice(-1);
        }
        catch(Exception err){
            System.out.println(err.toString());
        }

        try{
            //Now let's try with a valid price
            product.setPrice(1000);
        }catch(Exception err){
            System.out.println(err.toString());
        }

        System.out.printf("Product ID: %s \n",product.getProductId());
        System.out.printf("Product price: %f \n", product.getPrice());

    }
}
