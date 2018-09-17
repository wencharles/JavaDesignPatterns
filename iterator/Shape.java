// represent a shape entity

public class Shape{
  private String name;

  public Shape(String name){
    this.name = name;
  }

  @Override
  public String toString(){
    return "Shape : " + this.name;
  }

}
