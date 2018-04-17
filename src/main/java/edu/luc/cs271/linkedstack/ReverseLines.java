package edu.luc.cs271.linkedstack;


import java.util.Scanner;

public class ReverseLines {

 public static void printReverse(final Scanner input) {

  String line;
  if (!input.hasNextLine())
     return;

   else
  {line = input.nextLine();
     System.out.println(line);
   printReverse(input);
  System.out.println(line);}
 }


  public static void main(final String[] args) {

    final Scanner input = new Scanner(System.in);
    printReverse(input);


    /**LinkedStack<String> printback = new LinkedStack<>();
    LinkedStack<String> printer = new LinkedStack<>();

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

Scanner keyboard = new Scanner(System.in);
    while(keyboard.hasNext())
    {
      String lineI = keyboard.nextLine();
      printer.push(lineI);
    }

    while(!printer.isEmpty())
    {
      final String lineII = printer.pop();
      System.out.println(lineII);
    }*/

  }
}
