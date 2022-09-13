package satellite;


public class Satellite {
    
    /**
     * Constructor for Satellite
     * @param name
     * @param height
     * @param velocity
     */
    public Satellite(String name, int height, double position, double velocity) {
        this.name = name;
        this.height = height;
        this.position = position;
        this.velocity = velocity;
    }
    private String name;
    private Integer height;
    private double position;
    private double velocity;

    /**
     * Getter for name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Getter for position (degrees)
     */
    public double getPositionDegrees() {
        return position;
    }

    /**
     * Getter for position (radians)
     */
    public double getPositionRadians() {
        return Math.toRadians(position);
    }

    /**
     * Returns the linear velocity (metres per second) of the satellite
     */
    public double getLinearVelocity() {
        return velocity;
    }

    /**
     * Returns the angular velocity (radians per second) of the satellite
     */
    public double getAngularVelocity() {
        return velocity / (this.getHeight() * 1000);
    }

    /**
     * Setter for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter for height
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Setter for velocity
     * @param velocity
     */
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    /**
     * Setter for position
     * @param position
     */
    public void setPosition(double position) {
        this.position = position;
    }

    /**
     * Calculates the distance travelled by the satellite in the given time
     * @param time (seconds)
     * @return distance in metres
     */
    public double distance(double time) {       
        double result = this.getLinearVelocity() * time;
        return result;
    }

    public static void main(String[] args) {
        Satellite satA = new Satellite("Satellite A", 10000, 122, 55);
        Satellite satB = new Satellite("Satellite B", 5438, 0, 234000);
        Satellite satC = new Satellite("Satellite C", 9029, 284, 0);
        
        System.out.println("I am " + satA.getName() + " at position " + satA.getPositionDegrees() + " degrees, " + satA.getHeight() + 
            " km above the centre of the earth and moving at a velocity of " + satA.getLinearVelocity() + " metres per second");
        satA.setHeight(9999);
        satB.setPosition(45);
        satC.setVelocity(36.5);
        System.out.println(satA.getPositionRadians());
        System.out.println(satB.getAngularVelocity());
        System.out.println(satC.distance(60*2));
    }
}