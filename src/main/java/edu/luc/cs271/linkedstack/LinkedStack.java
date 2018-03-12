package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /**
   * The topmost node of this stack. The stack gets pushed down from here.
   */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    top = new Node<>(obj, top);
    return obj;
  }

  @Override
  public E peek() {
   E info;
    if (isEmpty())
      throw new NoSuchElementException();

    else {
      info = top.data;
    }
    return info;

  }


  @Override
  public E pop() {
    E popped;
    if (isEmpty())
      throw new NoSuchElementException();

    else {
      popped = top.data;
      top = top.next;
    }
      return popped;
  }

  @Override
  public boolean isEmpty() {
    if(top == null)
    {return true;}
    else
    {return false;}
  }

  @Override
  public List<E> asList() {
    List<E> printing = new ArrayList<>();
final Node <E> realtop = top;
while (top != null){
  printing.add(top.data);
  top = top.next;
}
top = realtop;
return printing;
  }
}
