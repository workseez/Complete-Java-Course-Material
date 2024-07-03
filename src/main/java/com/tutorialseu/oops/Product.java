package com.tutorialseu.oops;

public class Product {
    private String productId;
    private double price;

    public String getProductId() {
        return productId;
    }

    //Validating variables in setter methods
    public void setProductId(String productId) {
        if (productId != null && !productId.isEmpty()) {
            this.productId = productId;
        } else {
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be positive");
        }
    }
}
