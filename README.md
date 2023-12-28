# OOPs (Day - 1) :

## Topic: 1 - Object and Class

```java
// Class Definition
// Defining the Keyboard class to represent a keyboard object with attributes.
class Keyboard {
    int id;
    String colour;
    String connectivityType;
    String keyType;
}

class Main {
    public static void main(String[] args) {
        // Outputting an introduction message
        System.out.println("OOPs");

        // Object Creation and Property Assignment
        // Creating a main class to demonstrate object creation and property assignment.
        // Object Instantiation
        // Creating an instance of the Keyboard class named k1.
        Keyboard k1 = new Keyboard();

        // Property Assignment
        // Setting properties for the k1 object.
        k1.colour = "Black";
        k1.connectivityType = "Bluetooth";
        k1.keyType = "Mechanical";

        System.out.println("My Keyboard color is " + k1.colour + " and Type of " + k1.keyType +
                " and It is a " + k1.connectivityType + " keyboard.");
    }
}


```

## Topic: 2 - Constructor

```java
// The Keyboard class represents a keyboard object with attributes and constructors for initialization.
class Keyboard {
    int id;
    String colour;
    String connectivityType;
    String keyType;

    // Constructor:
    // Default Constructor
    Keyboard() {
        // Setting default values for a new Keyboard object
        this.id = 0;
        this.colour = "Black";
        this.connectivityType = "Bluetooth";
        this.keyType = "Mechanical";
    }

    // Parameterized Constructor:
    // Allows customization of the keyboard properties during object creation
    Keyboard(String colour, String connectivityType, String keyType) {
        this.colour = colour;
        this.connectivityType = connectivityType;
        this.keyType = keyType;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("OOPs");

        // Object Creation and Default Constructor
        // Creating a Keyboard object using the default constructor
        Keyboard k1 = new Keyboard();

        // Property Assignment
        // Setting specific values for the k1 object
        k1.colour = "Black";
        k1.connectivityType = "Bluetooth";
        k1.keyType = "Mechanical";

        // Object Information Display
        // Displaying information about the keyboard using its properties
        System.out.println("My Keyboard color is " + k1.colour + " and Type of " + k1.keyType +
                " and It is a " + k1.connectivityType + " keyboard.");
        
        // Creating another instance using the parameterized constructor
        // This time, providing specific values during object creation
        Keyboard k2 = new Keyboard("White", "Wired", "Membrane");

        // Displaying information about the second keyboard
        System.out.println("Another Keyboard color is " + k2.colour + " and Type of " + k2.keyType +
                " and It is a " + k2.connectivityType + " keyboard.");
    }
}

```

## Topic: 3 - Constructor Chaining

```java
class Keyboard {
    int id;
    String colour;
    String connectivityType;
    String keyType;

    // Default Constructor
    Keyboard() {
        this.id = 0;
        this.colour = "Black";
        this.connectivityType = "Bluetooth";
        this.keyType = "Mechanical";
    }

    // Parameterized Constructors
    public Keyboard(int id, String colour) {
        this.id = id;
        this.colour = colour;
    }

    public Keyboard(int id, String colour, String connectivityType) {
        this.id = id;
        this.colour = colour;
        this.connectivityType = connectivityType;
    }

    Keyboard(String colour, String connectivityType, String keyType) {
        this.colour = colour;
        this.connectivityType = connectivityType;
        this.keyType = keyType;
    }
}
```


## Topic: 4 - Copy Constructor

```java
class Keyboard {
    int id;
    String colour;
    String connectivityType;
    String keyType;

    // Default Constructor
    Keyboard() {
        this.id = 0;
        this.colour = "Black";
        this.connectivityType = "Bluetooth";
        this.keyType = "Mechanical";
    }

    // Parameterized Constructors
    Keyboard(int id, String colour, String connectivityType, String keyType) {
        this.id = id;
        this.colour = colour;
        this.connectivityType = connectivityType;
        this.keyType = keyType;
    }

    // Copy Constructor
    // Used to clone an object by copying the values of another object of the same type
    Keyboard(Keyboard k) {
        this.id = k.id;
        this.colour = k.colour;
        this.connectivityType = k.connectivityType;
        this.keyType = k.keyType;
    }
}

```

## Topic: 5 - Getter and Setter

```java
// Class Definition with Constructors and Copy Constructor
class Keyboard {
    int id;
    String colour;
    String connectivityType;
    String keyType;

    // Default Constructor
    Keyboard() {
        this.id = 0;
        this.colour = "Black";
        this.connectivityType = "Bluetooth";
        this.keyType = "Mechanical";
    }

    // Parameterized Constructors
    public Keyboard(int id, String colour) {
        this.id = id;
        this.colour = colour;
    }

    public Keyboard(int id, String colour, String connectivityType) {
        this.id = id;
        this.colour = colour;
        this.connectivityType = connectivityType;
    }

    Keyboard(String colour, String connectivityType, String keyType) {
        this.colour = colour;
        this.connectivityType = connectivityType;
        this.keyType = keyType;
    }

    // Copy Constructor
    // Used to clone an object by copying the values of another object of the same type
    Keyboard(Keyboard k) {
        this.id = k.id;
        this.colour = k.colour;
        this.connectivityType = k.connectivityType;
        this.keyType = k.keyType;
    }

    // Getter and Setter methods for encapsulation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getConnectivityType() {
        return connectivityType;
    }

    public void setConnectivityType(String connectivityType) {
        this.connectivityType = connectivityType;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }
}

```

## Topic: 6 - 'this' keyword

```java
class Keyboard {
    int id;
    String colour;
    String connectivityType;
    String keyType;

    // Constructor:
    // Default Constructor
    Keyboard() {
        this.id = 0;
        this.colour = "Black";
        this.connectivityType = "Bluetooth";
        this.keyType = "Mechanical";
    }

    // Parameterized Constructor:
    // Customizes the Keyboard attributes based on user input
    // 2 Parameter
    public Keyboard(int id, String colour) {
        this.id = id;
        this.colour = colour;
    }

    // 3 Parameter
    public Keyboard(int id, String colour, String connectivityType) {
        this(id, colour);
        this.connectivityType = connectivityType;
    }

    // 4 Parameter
    Keyboard(int id, String colour, String connectivityType, String keyType) {
        this(id, colour, connectivityType);
        this.keyType = keyType;
    }

    // Copy Constructor:
    // Copy Constructor use to clone an object
    Keyboard(Keyboard k){
        this(k.id, k.colour, k.connectivityType, k.keyType);
    }
}
```

## Topic: 7 - Static 
```java
class Main {
    public static void main(String[] args) {
        // Example 1: Creating humans and accessing the population
        Human person1 = new Human("Soumitra");
        Human person2 = new Human("Ryan");

        // Accessing the population using the class name
        int totalPopulation = Human.population;
        System.out.println("Total Population: " + totalPopulation);

        // Example 2: Creating more humans and updating the population
        Human person3 = new Human("Charlie");
        Human person4 = new Human("David");

        // Accessing the population again
        totalPopulation = Human.population;
        System.out.println("Updated Total Population: " + totalPopulation);

        //O/P:
        //Soumitra is born! Current Population: 1
        //Ryan is born! Current Population: 2
        //Total Population: 2
        //Charlie is born! Current Population: 3
        //David is born! Current Population: 4
        //Updated Total Population: 4
    }
}

class Human {
    // Static => this attribute belongs to the class, not the instance of the class
    // It is shared among all instances of the class
    static int population;

    // Instance attribute
    String name;

    // Constructor to initialize the instance attribute
    public Human(String name) {
        this.name = name;
        // Incrementing the population each time a new human is created
        population++;
        // Outputting a message for demonstration
        System.out.println(name + " is born! Current Population: " + population);
    }
}

```

## Topic: 8 - Use Cases of Static/Non-Static (Limitations)

| Context                    | Accessing Static Variable | Accessing Non-Static Variable |
| -------------------------- | ------------------------- | ----------------------------- |
| Static Method              | Yes                       | No                            |
| Non-Static Method (Instance)| Yes                       | Yes                           |
| Static Block/Initializer   | Yes                       | No                            |
| Non-Static Block/Initializer| Yes                       | Yes                           |
| Constructor (Instance)     | Yes                       | Yes                           |

Explanation:

1. **Static Method:**
   - Static methods can access static variables directly but cannot access non-static (instance) variables or methods without creating an instance of the class.

2. **Non-Static Method (Instance):**
   - Non-static methods (instance methods) can access both static and non-static variables directly.

3. **Static Block/Initializer:**
   - Static blocks and initializers can access static variables directly but cannot access non-static variables.

4. **Non-Static Block/Initializer:**
   - Non-static blocks and initializers can access both static and non-static variables directly.

5. **Constructor (Instance):**
   - Constructors, being instance methods, can access both static and non-static variables directly.