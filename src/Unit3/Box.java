package Unit3;

/*Create a class Box, which has three variables width, height and depth. It has a default contructor to
    provide default value to the variables. Two functions to calculate and display area of box.*/
public class Box {
    private
      int width, height, depth, area;
    public
      Box(){
         width = 0;
         height = 0;
         depth = 0;
      }
      void calculate(int w, int h, int d){
          width = w;
          height = h;
          depth = d;
          area = width*height*depth;
      }
      void display(){
          System.out.println("Area of box: "+area);
      }
      public static void main(String args[]){
          Box b = new Box();
          b.calculate(12,45,25);
          b.display();
      }
}
