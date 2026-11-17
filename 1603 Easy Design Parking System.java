class ParkingSystem {
    // Array to store available slots: index 1 for big, 2 for medium, 3 for small
    private int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        slots = new int[] { 0, big, medium, small };
    }
    
    public boolean addCar(int carType) {
        // Check if there are available slots for this car type
        if (slots[carType] > 0) {
            slots[carType]--; // Take one parking spot
            return true;
        }
        return false; // No spots left
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
