package Unit3;

public class Car {
    // Create a carName() method
  static void carName() {
    System.out.println("Ferrari");
  }
  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
      Car c = new Car();
      c.speed(150);
      Car.carName();
  }
}
