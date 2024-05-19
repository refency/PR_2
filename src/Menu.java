import java.util.ArrayList;

class Menu {
  static void all_menu() { // Main menu call function
    main_menu();
    menu_type_defifinition(Functions.create_list());
  }

  static void all_menu(ArrayList<City> city) { // Main menu call function
    main_menu();
    menu_type_defifinition(city);
  }

  static void main_menu() { // Output in console all points of menu
    System.out.println(Functions.Color("yellow") + "Input the command" + Functions.Color("reset"));

    System.out.println(Functions.Color("green") + "1" + Functions.Color("reset") + " - " + Functions.Color("blue")
                      + "Insert the empty object in list" + Functions.Color("reset"));

    System.out.println(Functions.Color("green") + "2" + Functions.Color("reset") + " - " + Functions.Color("blue")
                      + "Insert the object of list manually" + Functions.Color("reset"));

    System.out.println(Functions.Color("green") + "3" + Functions.Color("reset") + " - " + Functions.Color("blue")
                      + "Change fill in the object" + Functions.Color("reset"));

    System.out.println(Functions.Color("green") + "4" + Functions.Color("reset") + " - " + Functions.Color("blue")
                      + "Output the data of list in console" + Functions.Color("reset"));

    System.out.println(Functions.Color("green") + "5" + Functions.Color("reset") + " - " + Functions.Color("blue")
                      + "Sort list by printed field" + Functions.Color("reset"));

    System.out.println(Functions.Color("green") + "6" + Functions.Color("reset") + " - " + Functions.Color("red")
                      + "exit" + Functions.Color("reset"));
  }

  static void menu_type_defifinition(ArrayList<City> city) { // Menu item call
    String input = Functions.input_text("Input menu item: ");

    switch (input) {
      case "1":
        Functions.create_empty_object(city);
        all_menu(city);
      case "2":
        Functions.create_manually_object(city);
        all_menu(city);
      case "3":
        Functions.change_list(city);
        all_menu(city);
      case "4":
        Functions.output_list(city);
        all_menu(city);
      case "5":
        Functions.sort_list(city);
        all_menu(city);
      case "6":
        System.exit(0);
      default:
        input = "";
        all_menu(city);
    }
  }
}