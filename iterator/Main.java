
// main

public class Main{
  public static void main(String[] args){
    /*ShapeCollection collection = new ShapeCollection();

    collection.add(new Shape("Circle"));
    collection.add(new Shape("Rect"));
    collection.add(new Shape("Square"));
    collection.add(new Shape("Polygon"));
    collection.add(new Shape("MyShape"));
    collection.add(new Shape("Da;alsl"));
    collection.add(new Shape("No Shape"));

    Iterator shapeIterator = collection.iterator();

    while(shapeIterator.hasNext()){
      Shape currentShape = (Shape) shapeIterator.next();
      System.out.println(currentShape);
    }*/

    ShapeList shapeList = new ShapeList();

    shapeList.add(new Shape("Shape"));
    shapeList.add(new Shape("Shape"));
    shapeList.add(new Shape("Shape"));
    shapeList.add(new Shape("Shape"));
    shapeList.add(new Shape("Shape"));
    shapeList.add(new Shape("Shape"));
    shapeList.add(new Shape("Shape"));
    shapeList.add(new Shape("Shape"));

   Iterator iterator = shapeList.iterator();
   while(iterator.hasNext()){
     Shape currentShape = (Shape) iterator.next();
     System.out.println(currentShape);
   }
  }
}
