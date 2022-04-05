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
    System.out.println("pets " + name);
  }

  @Override
  public void mood(String mood) {
    System.out.println(mood);
  }

  @Override
  public void eat(String foodType) {
    System.out.println("eats " + foodType);
  }
}
