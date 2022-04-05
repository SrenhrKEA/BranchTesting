public class Test {
  public static void main(String[] args) {
    new Test().runProgram();
  }

  public void runProgram() {
    Cat cat = new Cat("Kisser");
    cat.makeSound();
    Dog dog = new Dog("Ludvig");
    dog.makeSound();
    cat.pet("Kisser");
    dog.pet("Ludvig");
  }
}
