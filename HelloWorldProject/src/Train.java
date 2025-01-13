public class Train {
    private String name, product, origin, destination;
    private int weight, miles;

    // car constructor
    public Train(String carName, String contents, String ogCity, String dest, int w, int m) {
        carName = name;
       contents  = product;
        origin = ogCity;
        dest = destination;
        w = weight;
        m = miles; 
    }
    // engine constructor
    public Train(String car, String fin) {
        car = name;
        fin = destination;
    }

    //get methods
    public getName () {
        return name;
    }
    
    public getProduct () {
        return product;
    }

    public getOgCity () {
        return ogCity;
    }

    public getDestination () {
        return destination;
    }

    public getWeight () {
        return weight;
    }

    public getMiles () {
        return miles;
    }
}
