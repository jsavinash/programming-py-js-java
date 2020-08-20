package javap.OOPS.j_aggregation;

//Unidirectional relationship.
class Shape {
    int square(int a) {
        return a * a;
    }
}

class Geometry {
    Shape sq;

    int squareArea(int a) {
        sq = new Shape();
        return sq.square(a);
    }
}

class Operations {
    public static void main(String args[]) {
        Geometry g1 = new Geometry();
        System.out.println("Area :: " + g1.squareArea(2));
    }
}