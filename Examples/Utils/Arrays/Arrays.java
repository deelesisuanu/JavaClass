public class Arrays {

    public static void main(String[] args) {

        String[] cars = {
            "Maserrati", // -- Position 0 <--> [Size index Number 1]
            "Bugatti", // -- Position 1 <--> [Size index Number 2]
            "Benz", // -- Position 2 <--> [Size index Number 3]
            "Ferrari", // -- Position 3 <--> [Size index Number 4]
            "Lamborghini", // -- Position 4 <--> [Size index Number 5]
            "Rolls Royce" // -- Position 5 <--> [Size index Number 6]
        };

        System.out.println("Number of Cars is : " + cars.length);
        System.out.println("Current Car: " + cars[3]);

    }

}