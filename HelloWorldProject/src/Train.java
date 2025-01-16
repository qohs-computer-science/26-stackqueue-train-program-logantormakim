public class Train {
    private String name, product, origin, destination;
    private int weight, miles;

    // car constructor
    public Train(String carName, String contents, String ogCity, String dest, int w, int m) {
        name = carName;
        product  = contents;
        ogCity = origin;
        destination = dest;
        weight = w;
        miles = m; 
    }
    // engine constructor
    public Train(String car, String fin) {
        engName = car;
        engDest = fin;
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

    public setMiles () {
        miles = 100;
        return miles;
    }
}
