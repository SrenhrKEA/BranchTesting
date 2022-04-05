public abstract class Animal {
  private final String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract void makeSound();

  public abstract void eat(String foodType);

  public abstract void pet(String name);

  public abstract void mood(String mood);
}


