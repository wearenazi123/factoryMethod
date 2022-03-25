package com.company;

public class Implementation2  implements Service{
    private  Implementation2(){}
    @Override
    public void method1() {
        System.out.println("Implementation12 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation12 method2");
    }
    public static ServiceFactory factory=new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}
