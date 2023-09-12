public class oppsCIRCLEclass { // object

    public double radius; // properties

    // methods

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;

    }

    public double circumference() {
        return perimeter();
    }
}


 class circle {
        public static void main(String[] args) {
            oppsCIRCLEclass c = new oppsCIRCLEclass(); // creating object of class 
            c.radius = 7;
            System.out.println("area" + c.area());
            System.out.println("perimeter" +c.perimeter());
        }
    }
