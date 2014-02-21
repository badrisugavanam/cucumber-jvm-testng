package com.badri.cucumberjvmhelloworld;

/**
 * Hello world!
 *
 */
public class App 
{
   int a;
   int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public int add(int a,int b){
        this.a=a;
        this.b=b;
        return (this.a+this.b);
    }
}
