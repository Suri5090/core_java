package com.multithread;

public class Display {

    public void displayn(){
        for(int i=1; i<10; i++)
        {
            try{
                System.out.print(i);
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }

    public void displayc() {
        for (int i = 65; i < 75; i++) {
            try {
                System.out.print((char) i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    public  void wish(String name){
        synchronized (this){
            for(int i=0; i<10; i++){
                try{
                    System.out.print("Good Morning: ");
                    Thread.sleep(1000);
                }catch (InterruptedException e){}
                System.out.println(name);
            }
        }
    }
}
