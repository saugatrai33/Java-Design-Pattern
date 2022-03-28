package com.company.behavioural.interpreter;

public class InterpreterPatternClient {
    public static void main(String[] args) {
        var infixPattern = new InfixToPostFixPattern();
        System.out.println(infixPattern.conversion("randy"));
    }
}
