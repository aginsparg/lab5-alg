package edu.luc.cs271.linkedstack;


import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {

    LinkedStack<String> printback = new LinkedStack<String>();

    Scanner input = IO.inFile("./resources/BackwardForwardPoem.txt");
    if (input == IO.inError)
    {
      System.out.println("Error: could not read input file.");
      System.exit(0);
    }

    while (input.hasNextLine())
    {
      final String line = input.nextLine();
      printback.push(line);
    }
input.close();

    while(!(printback.isEmpty()))
    {
      final String newline = printback.pop();
      System.out.println(newline);
    }



  }
}
