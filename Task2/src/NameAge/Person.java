package NameAge;

public class Person {

     private  String name;
      private int age;
// constructor with default age
      public Person (String name){
          this.name = name;
          this.age=18;
      }
    private  void display() {//Method to display the name and age
        System.out.println("Name of a person is " + name);
        System.out.println("Age of a person is " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("Deepi");//Creating object for the class

        person.display(); // Method call

        }


    }


