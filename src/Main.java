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
