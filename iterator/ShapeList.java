public class ShapeList{
  // head node
  private Node head;
  // tail node
  private Node tail;

  // add a shape to the list
  public void add(Shape shape){
    if(null == head){
      // this is the first shape
      Node node = new Node();
      node.value = shape;
      this.head = node;
      this.tail = this.head;
    }else{
      Node node = new Node();
      node.value = shape;
      this.tail.next = node;
      this.tail = node;
    }
  }

  // print
  public void print(){
    Node temp = this.head;
    while(temp != null){
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  // get iterator
  public Iterator iterator(){
    return new IteratorImpl();
  }

  private class IteratorImpl implements Iterator{
    private Node currentNode = ShapeList.this.head;

    @Override
    public Object next(){
      Shape returnValue = currentNode.value;
      currentNode = currentNode.next;
      return returnValue; 
    }

    @Override
    public boolean hasNext(){
      if(currentNode == null){
        return false;
      }
      return true;
    }
  }
}
