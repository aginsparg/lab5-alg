package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /**
   * The topmost node of this stack. The stack gets pushed down from here.
   */
  private Node<E> top;
int size;
  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    top = new Node<>(obj, top);
    size=size++;
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
    final ArrayList<E> result = new ArrayList<>();//size);
    populateList(top, result);
    return result;
  }



  private void populateList(final Node<E> curr, final List<E> result) {
    if (curr == null)
      return;
    else
    {
      result.add(curr.data);
      populateList(curr.next, result);
    }
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateFifoList(top, result); // TODO replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    if (curr == null)
      return;
    else
    {
      populateFifoList(curr.next, result);
      result.add(curr.data);
    }

   }
}