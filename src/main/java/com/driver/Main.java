package com.driver;

public class Main {
    public  static  void main (String [] arg){
        Product p = new Product();
        p.product(12,56);
        p.product(12,65,78);
        p.product(4.5, 6.2);
    }

}
class Product{
    public int product(int x, int y) {
int sum = x*y;
return sum ;

    }
    public int product(int x, int y, int z) {
int sum1 = x * y * z;
return  sum1;
    }
    public double product(double x, double y) {
        double sum3 = x*y;
        return  sum3;
    }



}