package de.fhh.pr2.rpump.u.a2;



/**
 * A simple Point class.
 * 
 * @author Jonne Haß
 * @author Richard Pump
 *
 */
public class Point {
    private int x;
    private int y;
    

    /**
     * Create a new point initialized to (0,0) 
     */
    public Point() {
        this.setLocation(0, 0);
    }
    
    /**
     * Creates a new point initialized with the given coordinates.
     * 
     * @param x
     * @param y
     * @throws IllegalArgumentException
     */
    public Point(int x, int y) throws IllegalArgumentException {
        this.setLocation(x, y);
    }
    
    /*
     * Create a new point initialized to the coordiantes given by the Point
     * 
     * @param p a Point
     * @throws IlleagalArgumentException
     */
    public Point(Point p) {
    	this.setLocation(p.getX(), p.getY());
    }
    
    /**
     * Gets the current value of the x coordinate.
     * 
     * @return The current value of the x coordinate.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Gets the current value of the y coordinate.
     * 
     * @return The current value of the y coordinate.
     */
    public int getY() {
        return this.y;
    }
    
    /**
     * Sets the current value of the x coordinate.
     * 
     * Throws IllegalArgumentException if the parameter is below 0.
     * 
     * @param x A  value greater or equal 0.
     * @throws IllegalArgumentException
     */
    public void setX(int x) throws IllegalArgumentException {
//       if (x < 0) {
//           throw new IllegalArgumentException("x should be greater equal 0");
//       }
       this.x = x;
    }
    
    /**
     * Sets the current value of the y coordinate.
     * 
     * Throws IllegalArgumentException if the parameter is below 0.
     * 
     * @param y A  value greater or equal 0.
     * @throws IllegalArgumentException
     */
    public void setY(int y) throws IllegalArgumentException {
//       if (x < 0) {
//           throw new IllegalArgumentException("y should be greater equal 0");
//       }
        this.y = y;
    }
    
    
    /**
     * Shorthand to set both coordinates simultaneously.
     * 
     * Throws IllegalArgumentException if one of the parameters is below 0.
     * 
     * @param x
     * @param y
     * @throws IllegalArgumentException
     */
    public void setLocation(int x, int y) throws IllegalArgumentException {
        this.setX(x);
        this.setY(y);
    }
    
    
    
    /**
     * Moves the point with the given parameters.
     * 
     * Adds dx and dy to the respective coordinates.
     * Throws IllegalArgumentException if one of the coordinates of the
     * resulting point is below 0.
     * 
     * @param dx Value to add to x
     * @param dy Value to add to y
     * @throws IllegalArgumentException
     */
    public void translate(int dx, int dy) throws IllegalArgumentException {
        this.setLocation(this.getX()+dx, this.getY()+dy);
    }

    
    /**
     * Gives the "Manhattan distance" to a second point.
     * 
     * @param p A second point to compute the "Manhattan distance" with.
     * @return The "Manhattan distance" to p
     */
    public double manhattenDistance(Point p) {
        return Math.abs(p.getX()-this.getX())+Math.abs(p.getY()-this.getY());
    }
    
    /**
     * Gives the distance to a second point
     * 
     * @param p A second point to compute the distance to
     * @return The distance to p
     */
    public double distance(Point p) {
       return Math.sqrt(Math.pow(p.getX()-this.getX(),2)+Math.pow(p.getY()-this.getY(), 2));
    }
    
    /**
     * Gives the distance from origin (0, 0).
     * 
     * @return the distance from origin
     */
    public double distanceFromOrigin() {
        return this.distance(new Point(0, 0));
    }
    
    public double vectorLength(){
    	return Math.sqrt((this.getX()*this.getX()) + (this.getY()*this.getY()));
    }
    
    public String toString() {
        return "("+this.getX()+","+this.getY()+")";
    }
}
