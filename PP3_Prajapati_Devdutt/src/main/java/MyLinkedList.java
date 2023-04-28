/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dattu
 */
public class MyLinkedList<E extends Comparable<E>>  {
   private Node<E> head, tail;
   private int size = 0; // Number of elements in the list
  

   public MyLinkedList() {
      head=tail=null;
      size=0;
   }
   
   public E get(int index){
        if (size == 0) {
         return null;
      }
        else{
            Node<E> current = head;
         for (int i = 1; i < index; i++) {
            current = current.next;
          
         }  
         return current.element;
        }
   }
  
    
  /** Return the head element in the list */
   public E getFirst() {
      if (size == 0) {
         return null;
      }
      else {
         return head.element;
      }
   }

  /** Return the last element in the list */
   public E getLast() {
      if (size == 0) {
         return null;
      }
      else {
         return tail.element;
      }
   }
  
 
  /** Add an element to the beginning of the list */
   public void addFirst(E e) {
      Node<E> newNode = new Node<>(e); // Create a new node
      newNode.next = head; // link the new node with the head
      head = newNode; // head points to the new node
      size++; // Increase list size
   
      if (tail == null) // the new node is the only node in list
         tail = head;
   }

  /** Add an element to the end of the list */
   public void addLast(E e) {
      Node<E> newNode = new Node<>(e); // Create a new for element e
   
      if (tail == null) {
         head = tail = newNode; // The new node is the only node in list
      }
      else {
         tail.next = newNode; // Link the new with the last node
         tail = newNode; // tail now points to the last node
      }
   
      size++; // Increase size
   }
  
  
  
   public void add(int index, E e) {
      if (index == 0) {
         addFirst(e);
      }
      else if (index >= size) {
         addLast(e);
      }
      else {
         Node<E> current = head;
         for (int i = 1; i < index; i++) {
            current = current.next;
         }
         Node<E> temp = current.next;
         current.next = new Node<>(e);
         (current.next).next = temp;
         size++;
      }
   }
  
  
  //Add e to the end of this linkedlist
  public void add(E e) {
    Node<E> newNode = new Node<>(e); // Create a new for element e
    if(head==null){
        head=tail=newNode;
    }
    else{
         tail.next = newNode; // Link the new with the last node
         tail = newNode; // tail now points to the last node
      
    }
      size++; // Increase size
    
  }
    

  /** Remove the head node and
   *  return the object that is contained in the removed node. */
   public E removeFirst() {
      if (size == 0) {
         return null;
      }
      else {
         E temp = head.element;
         head = head.next;
         size--;
         if (head == null) {
            tail = null;
         }
         return temp;
      }
   }

  /** Remove the last node and
   * return the object that is contained in the removed node. */
   public E removeLast() {
      if (size == 0) {
         return null;
      }
      else if (size == 1) {
         E temp = head.element;
         head = tail = null;
         size = 0;
         return temp;
      }
      else {
         Node<E> current = head;
      
         for (int i = 0; i < size - 2; i++) {
            current = current.next;
         }
      
         E temp = tail.element;
         tail = current;
         tail.next = null;
         size--;
         return temp;
      }
   }

  /** Remove the element at the specified position in this 
   *  list. Return the element that was removed from the list. */
   public E remove(int index) {   
      if (index < 0 || index >= size) {
         return null;
      }
      else if (index == 0) {
         return removeFirst();
      }
      else if (index == size - 1) {
         return removeLast();
      }
      else {
         Node<E> previous = head;
      
         for (int i = 1; i < index; i++) {
            previous = previous.next;
         }
      
         Node<E> current = previous.next;
         previous.next = current.next;
         size--;
         return current.element;
      }
   }
  
   /** Clear the list */
   public void clear() {
      size = 0;
      head = tail = null;
   }
   
   
        /** Override toString() to return elements in the list in [] separated by , */
   public String toString() {
      StringBuilder result = new StringBuilder("[");
   
      Node<E> current = head;
      for (int i = 0; i < size; i++) {
         result.append(current.element);
         current = current.next;
         if (current != null) {
            result.append(", "); // Separate two elements with a comma
         }
         else {
            result.append("]"); // Insert the closing ] in the string
         }
      }
   
      return result.toString();
   }

     
  /** Return true if this list contains no elements */
   public boolean isEmpty() {
      return size==0;
   }

 /** Return the number of elements in this list */
   public int size() {
     int size=0;
     for (int i = 0; i < this.size; i++){
         size= size+1;
     }
      return size;
   }

/** Remove the first occurrence of the element e 
  *  from this list. Return true if the element is removed. */
   public E remove(E value)
   {
     Node<E> current = head;
     int indx_c;
     for (indx_c = 0; indx_c < size; indx_c++) {
         if(current.element.equals(value)) {
             return remove(indx_c); 
              
              }
          current = current.next;
              }
              return null;
        }

/** Adds a new node containing new value after the given index. */
   void addAfter(int index, E value)
   {
    Node<E> current = head;
     for (int indx_c = 0; indx_c <= index; indx_c++) {
         current = current.next;
     }
     Node<E>temp=current.next;
     current.next = new Node<>(value);
     
   }
   
  /** replaces the data in the node at position index with newValue, 
  * if such a position is in the list and returns the previous (old) value that was at that location. 
  * Prints an error message and returns null if index is out of range. */
   public E set(int index, E e) {
    // Left as an exercise
    Node<E> current = head;
     Node<E> previous = null;
     int indx_c;
     if(index<=size){
     for (indx_c = 0; indx_c <
             index; indx_c++) {
                     current=current.next;
         }
     Node<E>temp=current;
       current.element=e;
       return temp.element; 
   }
     else{
         return null;
     }
   }
   
  /** Remove all the occurrences of the element e 
  *  from this list. Return true if the element is removed. */
   public  boolean removeAll(E e) {
       int i = 0;
       int size=this.size;
       boolean yes=false;
       for(Node<E> curr= head; curr!= null; curr=curr.next){
           if(curr.element.equals(e)){
               this.remove(i);
               size--;
               yes=true;
           }
           else{
               i++;
           }
       }
      if(yes=true){
      return true;
   }
      else{
          return false;
      }
   }
   
 /** Return the index of the last matching element in 
   *  this list. Return -1 if no match. */
   public int lastIndex(E e) {
     Node<E> current = head;
     Node<E> previous = null;
     int indx_c;
     for (indx_c = 0; indx_c < size; indx_c++) {
         if(current.element.equals(e)){ 
             break;   
         }
         else {
             current=current.next;
         }
         
     }
     
     for (int i = indx_c; i < size; i++) {
          if(current.element.equals(e)){ 
             return i;     
         }
         else {
             current=current.next;
         }
     }
                 
      return -1; 
   }

/** returns a new copy of the LinkedList. It creates a copy of MyLinkedList.java. 
*   It creates a new instance of the class of the current object and initializes all its 
*   fields with exactly the contents of the corresponding fields of this object. */
   public MyLinkedList<E> clone(){
   MyLinkedList<E> newList = new MyLinkedList<>();

    Node<E> currentNode = head;
    while (currentNode != null) {
        newList.add(currentNode.element);
        currentNode = currentNode.next;
    }

    return newList;
   
      
   }

  
  /** Check to see if this list contains element e */
   public boolean contains(E e) {
    Node<E> current = head;
    
     int indx_c;
     for (indx_c = 0; indx_c < size; indx_c++) {
         if(current.element.equals(e)){
             return true;
                
         }
         else {
             current=current.next;
         }
         
     }
        return false;
   }
   
   /** Add a new element at the specified index in this list in ascending order */
   public void addInOrder(E value) {
       if (size == 0) {
        addFirst(value);
        return;
    }
    else if(value.compareTo(head.element)<=0){
        addFirst(value);
        return;
    }
    else if(value.compareTo(tail.element)>=0){
       addLast(value);
       return;
       }
       else{
    
    // Traverse the list to find the index where the new value should be inserted
    Node<E> prev = null;
    Node<E> curr = head;
    while (curr != null && value.compareTo(curr.element) > 0) {
        prev = curr;
        curr = curr.next;
    }
    
    // Create a new node with the new value
    Node<E> newNode = new Node<>(value);
    
    // Insert the new node at the appropriate index
    if (prev == null) { // Insert at the beginning
        newNode.next = head;
        head = newNode;
    } else {
        prev.next = newNode;
        newNode.next = curr;
    }
    
    size++;
   }
   }
   

  /** Overrides the equals method (found in the Object class). */
   public boolean equals(Object o) {
if (o == this) {
        return true;
    }
    if (!(o instanceof MyLinkedList)) {
        return false;
    }
    MyLinkedList<E> otherList = (MyLinkedList<E>) o;
    if (otherList.size() != size()) {
        return false;
    }
    Node<E> currentThis = head;
    Node<E> currentOther = otherList.head;
    while (currentThis != null) {
        if (!currentThis.element.equals(currentOther.element)) {
            return false;
        }
        currentThis = currentThis.next;
        currentOther = currentOther.next;
    }
    return true;
   }
  
  
  /** Split the original list in half. The original     
   * list will continue to reference the 
   * front half of the original list and the method 
   * returns a reference to a new list that stores the 
   * back half of the original list. If the number of 
   * elements is odd, the extra element should remain 
   * with the front half of the list. */
   public MyLinkedList<E> split(){
      MyLinkedList<E>temp= new MyLinkedList<>();
      int index = (int) Math.ceil(this.size()/2);
      for(int i= index;i<this.size();++i){
          temp.add(this.get(i));
          this.remove(i);
          i--;
      }
      return temp;
    
   }
   
   
   /** Print this list in reverse order */
   public void printList() {
 Node current = head;
    System.out.print("Linked List: ");
    while (current != null) {
        System.out.print(current.element + " ");
        current = current.next;
    }
    System.out.println();  
   }


  
  
  
   private static class Node<E> {
      E element;
      Node<E> next;
   
      public Node(E element) {
         this.element = element;
      }
   }
  
 
}