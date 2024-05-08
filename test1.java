class shape{
  public shape(){
    System.out.println("This is default constructor");
  }
  public shape(int x){
    System.out.println("this is over loaded constuctor with "+ x);
  }
}
class test1 extends shape{
  public test1(){
    super();
    System.out.println("Default");
  }
  public test1(int x){
    System.out.println("overloading with "+x);
  }
  void calculate(){
    System.out.println("volume");
  }
  public static void main(){
    test1 t1=new test1();
    test1 t2=new test1(20);
    t1.calculate();
    t2.calculate();
  }
}