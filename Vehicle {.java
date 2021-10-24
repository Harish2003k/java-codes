class Vehicle {
    int numWheels;
    String color;
    int numDoors;
    public Vehicle(int numWheels, String color, int numDoors) {
        this.numWheels = numWheels;
        this.color = color;
        this.numDoors = numDoors;
    }
    public String toString() {
        String h = "number of wheels" + numWheels +
            "color:" + color + "number of doors:" + numDoors;
        return h;
    }
}
class Driver {

    public static void main(String[] args) {

        Vehicle car = new Vehicle(4, "white", 4);
        Vehicle truck = new Vehicle(10, "black", 2);

        System.out.println(car.toString());
        System.out.println(truck.toString());
    }

}