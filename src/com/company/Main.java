package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factories.serviceConsumer(Implementation1.factory);
        Factories.serviceConsumer(Implementation2.factory);
    }
}
