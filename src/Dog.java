public class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Bark!");
  }

  @Override
  public void eat(String foodType) {
    System.out.println("eats "+foodType);
  }

}
