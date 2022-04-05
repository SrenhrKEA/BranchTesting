public abstract class Animal {
  private String name;
  private String foodType;

  public Animal(String name) {
    this.name = name;
  }

  public abstract void makeSound ();

  public abstract void eat(String foodType);

public abstract void pet(String name);
}


