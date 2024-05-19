import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Functions {
  public static String input_text(String label) { // Function of input text from console
    try {
      System.out.print(Color("yellow") + label + Color("reset"));
      // Call of system.in to read input from console by bufferedreader
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String text = reader.readLine(); // Write string with stream from buffer
      
      return text;
    } catch (IOException exception) {
      exception.printStackTrace();
      return exception.toString();
    }
  }

  public static String Color(String color) { // Function of symbols of ANSI to change color of text in console
    switch(color) {
      case("red"):
        return "\u001B[31m";
      case("green"):
        return "\u001B[32m";
      case("blue"):
        return "\u001B[34m";
      case("reset"):
        return "\u001B[0m";
      case("yellow"):
        return "\u001B[33m";
      default:
        return "";
    }
  }

  public static ArrayList<City> create_list() { // This function create empty list at first call of one overloading method
    ArrayList<City> city = new ArrayList<City>();

    return city;
  }

  public static void create_empty_object(ArrayList<City> city) {
    city.add(new City()); // Created empty object by constructor default
  }

  public static void create_manually_object(ArrayList<City> city) {
    city.add(new City(
      check_value(new String[] {input_text("Insert the name of city: ")}, "string")[0].toString(),
      check_value(new String[] {input_text("Insert the name region of city: ")}, "string")[0].toString(),
      Integer.parseInt(check_value(new String[] {input_text("Insert the population of city: ")}, "int")[0]),
      Integer.parseInt(check_value(new String[] {input_text("Insert the name district of city: ")}, "int")[0]),
      Double.parseDouble(check_value(new String[] {input_text("Insert the square of city: ")}, "double")[0]),
      Double.parseDouble(check_value(new String[] {input_text("Insert the density of city: ")}, "double")[0])
    )); // Created object
  }

  public static String[] check_value(String[] data, String type) {
    switch (type) {
      case "string":
        return data;
      case "int":
        try {
          Integer.parseInt(data[0]);
          return data;
        } catch (Exception exception) {
          fix_value(data);
        }
      case "double":
        try {
          Double.parseDouble(data[0]);
          return data;
        } catch (Exception exception) {
          fix_value(data);
        }
      default:
        return check_value(data, type);
    }
  }

  public static String[] fix_value(String[] data) {
    data[0] = input_text(Color("red") + "Data was been incorrect, type again: " + Color("reset"));

    return data;
  }

  public static void change_list(ArrayList<City> city) { // Change the field object of list
    check_list_empty(city);
    print_fields();

    String field = check_field(city);
    int index = check_index(city);

    switch (field) {
      case "1":
        city.get(index).set_name(check_value(new String[] {input_text("Insert the name of city: ")}, "string")[0].toString());
        break;
      case "2":
        city.get(index).set_region(check_value(new String[] {input_text("Insert the name region of city: ")}, "string")[0].toString());
        break;
      case "3":
        city.get(index).set_population(Integer.parseInt(check_value(new String[] {input_text("Insert the population of city: ")}, "int")[0]));
        break;
      case "4":
        city.get(index).set_district(Integer.parseInt(check_value(new String[] {input_text("Insert the name district of city: ")}, "int")[0]));
        break;
      case "5":
        city.get(index).set_square(Double.parseDouble(check_value(new String[] {input_text("Insert the square of city: ")}, "double")[0]));
        break;
      case "6":
        city.get(index).set_density(Double.parseDouble(check_value(new String[] {input_text("Insert the density of city: ")}, "double")[0]));
        break;
      default:
        change_list(city);
        break;
    }

    System.out.println(Functions.Color("green") + "Data of index succesfully changed" + Functions.Color("reset"));
  }

  public static String check_field(ArrayList<City> city) { // Checking exist field of object in list
    String field = input_text("Choose the field which you want to used, type the number: ");
    if (Integer.valueOf(field) > 6 || Integer.valueOf(field) < 0) {
      System.out.println(Color("red") + "Typed of field do not exist" + Color("reset"));

      change_list(city);
    }

    return field;
  }

  public static int check_index(ArrayList<City> city) { // Checking exist index of object in list
    String index = input_text("Type the index of object want to changed: ");

    if (Integer.valueOf(index) > city.size() || Integer.valueOf(index) < 0) {
      System.out.println(Color("red") + "Typed of index of object is undefined" + Color("reset"));

      change_list(city);
    }

    return Integer.valueOf(index);
  }

  public static void print_fields() { // Print all fields of object
    System.out.println(Color("green") + "1." + Color("reset") + Color("yellow") + "Name" + Color("reset"));
    System.out.println(Color("green") + "2." + Color("reset") + Color("yellow") + "Region" + Color("reset"));
    System.out.println(Color("green") + "3." + Color("reset") + Color("yellow") + "Population" + Color("reset"));
    System.out.println(Color("green") + "4." + Color("reset") + Color("yellow") + "District" + Color("reset"));
    System.out.println(Color("green") + "5." + Color("reset") + Color("yellow") + "Square" + Color("reset"));
    System.out.println(Color("green") + "6." + Color("reset") + Color("yellow") + "Density" + Color("reset"));
  }

  public static void output_list(ArrayList<City> city) { // Printed all objects of list in console
    check_list_empty(city);

    for(int i = 0; i < city.size(); i++) {
      System.out.print(i + " | ");
      System.out.print(city.get(i).get_name() + " | ");
      System.out.print(city.get(i).get_region() + " | ");
      System.out.print(city.get(i).get_population() + " | ");
      System.out.print(city.get(i).get_district() + " | ");
      System.out.print(city.get(i).get_square() + " | ");
      System.out.println(city.get(i).get_density());
    }
  }

  public static void check_list_empty(ArrayList<City> city) { // Checking of list is empty
    if (city.size() == 0) {
      System.out.println(Color("red") + "Objects are empty" + Color("reset"));

      Menu.all_menu(city);
    }
  }

  public static void sort_list(ArrayList<City> city) { // Sort all objects of list by choosen field
    check_list_empty(city);
    print_fields();

    String field = check_field(city);

    switch (field) {
      case "1":
        Collections.sort(city, City.compare_by_name);
        break;
      case "2":
        Collections.sort(city, City.compare_by_region);
        break;
      case "3":
        Collections.sort(city, City.compare_by_population);
        break;
      case "4":
        Collections.sort(city, City.compare_by_district);
        break;
      case "5":
        Collections.sort(city, City.compare_by_square);
        break;
      case "6":
        Collections.sort(city, City.compare_by_density);
        break;
      default:
        change_list(city);
        break;
    }

    System.out.println(Functions.Color("green") + "Data succesfully sorted by field" + Functions.Color("reset"));
  }
}
