import java.util.Comparator;

public class City {
  private String name, region;
  private Integer population, district;
  private Double square, density;

  City() { // Constructor default
    this.name = "";
    this.region = "";
    this.population = 0;
    this.district = 0;
    this.square = 0.0;
    this.density = 0.0;
  }

  City(String name, String region, int population, int district, double square, double density) { // Constructor with parameters
    this.name = name;
    this.region = region;
    this.population = population;
    this.district = district;
    this.square = square;
    this.density = density;
  }

  //
  // Comparators of list sort
  //

  public static Comparator<City> compare_by_name = new Comparator<City>() {
      public int compare(City one, City other) {
          return one.name.compareTo(other.name);
      }
  };

  public static Comparator<City> compare_by_region = new Comparator<City>() {
    public int compare(City one, City other) {
        return one.region.compareTo(other.region);
    }
  };

  public static Comparator<City> compare_by_population = new Comparator<City>() {
    public int compare(City one, City other) {
        return one.population.compareTo(other.population);
    }
  };

  public static Comparator<City> compare_by_district = new Comparator<City>() {
    public int compare(City one, City other) {
        return one.district.compareTo(other.district);
    }
  };

  public static Comparator<City> compare_by_square = new Comparator<City>() {
    public int compare(City one, City other) {
        return one.square.compareTo(other.square);
    }
  };

  public static Comparator<City> compare_by_density = new Comparator<City>() {
    public int compare(City one, City other) {
        return one.density.compareTo(other.density);
    }
  };

  //
  // setters functions
  //

  public String set_name(String name) {
    if (name.length() > 25) {
      return Functions.Color("red") + "Name of city is too large: " + Functions.Color("reset") + "\n";
    }
    if (name.length() < 2) {
      return Functions.Color("red") + "Name of city is too short: " + Functions.Color("reset") + "\n";
    }

    this.name = name;
    return print_success();
  }

  public String set_region(String region) {
    if (region.length() > 35) {
      return Functions.Color("red") + "Name of city region is too large: " + Functions.Color("reset") + "\n";
    }
    if (region.length() < 10) {
      return Functions.Color("red") + "Name of city region is too short: " + Functions.Color("reset") + "\n";
    }

    this.region = region;
    return print_success();
  }

  public String set_population(Integer population) {
    if (String.valueOf(population).length() > 10) {
      return Functions.Color("red") + "Population of city is too big: " + Functions.Color("reset") + "\n";
    }
    if (String.valueOf(population).length() < 1) {
      return Functions.Color("red") + "Population of city is too small: " + Functions.Color("reset") + "\n";
    }

    this.population = population;
    return print_success();
  }

  public String set_district(Integer district) {
    if (String.valueOf(district).length() > 3) {
      return Functions.Color("red") + "District of city is too big: " + Functions.Color("reset") + "\n";
    }
    if (String.valueOf(district).length() < 1) {
      return Functions.Color("red") + "District of city is too small: " + Functions.Color("reset") + "\n";
    }

    this.district = district;
    return print_success();
  }

  public String set_square(Double square) {
    if (String.valueOf(square).length() > 15) {
      return Functions.Color("red") + "Square of city is too big: " + Functions.Color("reset") + "\n";
    }
    if (String.valueOf(square).length() < 3) {
      return Functions.Color("red") + "Square of city is too small: " + Functions.Color("reset") + "\n";
    }

    this.square = square;
    return print_success();
  }

  public String set_density(Double density) {
    if (String.valueOf(density).length() > 15) {
      return Functions.Color("red") + "Density of city is too big: " + Functions.Color("reset") + "\n";
    }
    if (String.valueOf(density).length() < 3) {
      return Functions.Color("red") + "Density of city is too small: " + Functions.Color("reset") + "\n";
    }

    this.density = density;
    return print_success();
  }

  public static String print_success() {
    return Functions.Color("green") + "Data of index succesfully changed" + Functions.Color("reset") + "\n";
  }

  //
  // getters functions
  //

  public String get_name() {
    return name;
  }

  public String get_region() {
    return region;
  }

  public Integer get_population() {
    return population;
  }

  public Integer get_district() {
    return district;
  }

  public Double get_square() {
    return square;
  }

  public Double get_density() {
    return density;
  }
}
