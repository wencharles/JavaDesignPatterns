// store shape objects

public class ShapeCollection{
  // supporting array to store the collections
  private Shape[] shapeArray;
  // default size.
  private final int DEFAULT_SIZE = 20;
  // pointer to the current array location
  private int pointer;

  // constructor
  public ShapeCollection(){
    this.shapeArray = new Shape [DEFAULT_SIZE];
    pointer = 0;
  }

  // add a shape
  public void add(Shape shape){
    if(this.pointer >= DEFAULT_SIZE){
      throw new RuntimeException("Collection is full");
    }
    this.shapeArray[this.pointer] = shape;
    this.pointer++;
  }

  // print the contents of the collection
  public void print(){
    for(int count = 0; count < this.pointer; count++){
      System.out.println(this.shapeArray[count]);
    }
  }

  // get the iterator for this collection
  public Iterator iterator(){
    return new IteratorImpl();
  }

  private class IteratorImpl implements Iterator {
    private int counter = -1;

    @Override
    public Object next(){
      this.counter++;
      return ShapeCollection.this.shapeArray[this.counter];
    }

    @Override
    public boolean hasNext(){
      if(this.counter == ShapeCollection.this.pointer - 1){
        return false;
      }else{
        return true;
      }
    }
  }

}
