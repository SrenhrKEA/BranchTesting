public class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Bark!");
  }

  @Override
  public void pet(String name) {
    System.out.println("pet "+name);
  }
}
