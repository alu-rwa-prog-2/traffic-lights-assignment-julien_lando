// Author: Gihozo Landelin(main) & Julien Barezi

// Import the HashMap class
import java.util.HashMap;

public class Map {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    HashMap<String, String> countries = new HashMap<String, String>();
    HashMap<Integer, Integer> population = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> Age = new HashMap<Integer, Integer>();
    
    System.out.println("WE are starting by initializzing different hashmaps \n");



    // Add keys and values (Country, City)
    capitalCities.put("Rwanda", "Kigali");
    capitalCities.put("Kenya", "Nairobi");
    capitalCities.put("Burundi", "Bujumbura");
    System.out.println("The first hashmap is called capitalCities and it contains...  \n" + capitalCities);
      
   // Add keys and values to the second hashmap
      countries.put("England", "London");
      countries.put("Spain","Madrid");
      countries.put("France","Paris");
      System.out.println("The second map is called countries and it contains...  \n"+ countries);
      
    // Add keys and values to the third hashmap
      population.put(2000, 19);
      population.put(2006, 27);
      population.put(2012, 32);
      System.out.println("The third map is called population and it contains...  \n"+ population);
      
   // Add keys and values to the third hashmap
      Age.put(1996, 25);
      Age.put(2003, 18);
      Age.put(2010, 11);
      System.out.println("The fourth map is called Age and it contains...  \n"+ Age + "\n");
      
      // copying elements from countries to capitalCities
      System.out.println("Copying elements from countries to capitaCities..........\n");
      capitalCities.putAll(countries);
      System.out.println("Values in capitalCities after copying:  \n"+ capitalCities + "\n");
      
      // copying elements from capitalCities to countries
      System.out.println("Copying elements from capitalCities to countries............. \n");
      countries.putAll(capitalCities);
      System.out.println("Values in countries after copying:  \n"+ countries + "\n");
      
      // copying elements from Age to population
      System.out.println("Copying elements from Age to population...............");
      population.putAll(Age);
      System.out.println("Values in population after copying:  \n"+ population + "\n");
    }
  }


