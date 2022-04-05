public class Test {
  public static void main(String[] args) {
    new Test().runProgram();
  }

  public void runProgram() {
    Cat cat = new Cat("Pussycat");
    cat.makeSound();
    Dog dog = new Dog("Rollo");
    dog.makeSound();
    cat.eat("cat food");
    dog.eat("dog food");
  }
}
