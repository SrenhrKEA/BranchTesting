public class Test {
  public static void main(String[] args) {
    new Test().runProgram();
  }

  public void runProgram() {
    Cat cat = new Cat("Kisser");
    cat.makeSound();
    Dog dog = new Dog("Ludvig");
    dog.makeSound();
    cat.eat("cat food");
    dog.eat("dog food");
    cat.pet(cat.getName());
    dog.pet(dog.getName());
    dog.mood("logrer");
    cat.mood("spinder");
  }
}
