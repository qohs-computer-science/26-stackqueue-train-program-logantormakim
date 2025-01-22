public class Train {
    private String name, product, origin, destination;
    private int weight, miles;

    // car constructor
    public Train(String carName, String contents, String ogCity, String dest, int w, int m) {
        name = carName;
        product  = contents;
        origin = ogCity;
        destination = dest;
        weight = w;
        miles = m; 
    }
    // engine constructor
    public Train(String car, String fin) {
        name = car;
        destination = fin;
    }

    //get methods
    public String getName () {
        return  name;
    }
    
    public String getProduct () {
        return  product;
    }

    public String getOgCity () {
        return origin;
    }

    public String getDestination () {
        return destination;
    }

    public int getWeight () {
        return weight;
    }

    public int getMiles () {
        return miles;
    }

    public int setMiles () {
        miles = 100;
        return miles;
    }
    
    public String toString () {
        if (name.substring(0,3).equals("CAR")) {
              return name + " containing " + product;
        }
        else {
            return name + " is leaving for " + destination + " with the following cars: ";
        }
    } // end toString
}
