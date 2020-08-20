package javap.OOPS.j_association;

import java.util.List;
import java.util.ArrayList;

// One to One
// One to Many
// Many to One, and
// Many to Many
class City {
    String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }
}

class State {
    String stateName;
    List<City> citys;

    State(String stateName) {
        this.stateName = stateName;
    }

    String getState() {
        return this.stateName;
    }

    void setCities(List<City> citys) {
        this.citys = citys;
    }

    List<City> getCities() {
        return this.citys;
    }

}

class Operations {
    public static void main(String args[]) {
        State s1 = new State("Gujarat");
        City c1 = new City("Ahmedabad");
        City c2 = new City("Rajkot");
        List<City> cities = new ArrayList<City>();
        cities.add(c1);
        cities.add(c2);
        s1.setCities(cities);
        System.out.println("State " + s1.getState());
        System.out.println("Cities " + s1.getCities().get(1).cityName);
    }
}