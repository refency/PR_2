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

  public void set_name(String name) {
    this.name = name;
  }

  public void set_region(String region) {
    this.region = region;
  }

  public void set_population(Integer population) {
    this.population = population;
  }

  public void set_district(Integer district) {
    this.district = district;
  }

  public void set_square(Double square) {
    this.square = square;
  }

  public void set_density(Double density) {
    this.density = density;
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
