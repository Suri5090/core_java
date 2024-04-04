package com.Interview;

public class JavaProgramFlow {
    public String m1(String msg){
        System.out.println(msg);
        return msg;
    }

    public static String m2(String msg){
        System.out.println(msg);
        return msg;
    }

    JavaProgramFlow(){
        m1("one");
    }

    {
        m1("two");
    }

    static {
        m2("static-two");
    }

    String m = m1("Three");
    static String m1 = m2("static-three");

    public static void main(String[] args) {

        Object obj = new JavaProgramFlow();
    }
}
