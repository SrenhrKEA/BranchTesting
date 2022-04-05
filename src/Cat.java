public class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Meow!");
  }

  @Override
  public void pet(String name) {
    System.out.println("pet "+name);
  }
}
