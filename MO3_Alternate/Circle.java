package MO3_Alternate;

/** This does not compile, even though I have GeometricObject in the same folder
 * The compiler says that the overrides do not override any method from the supertype
 * I tried importing GeometricObject from package MO3 and also tried other
 * GeometricClass I have in package M02? Could not pinpoint the problem. Tried making 
 * alternate MO3 directory (package) but it made not difference. Is it something
 * with the way it makes the directory a package? It doesn't like the package? I tried
 * deleting the package and it complained. I don't get it. It is not connnecting supertype
 * with Circle.
 */

public class Circle extends GeometricObject {
    /** private variable */
    private double radius;

    /** no-arg constructor */
    public Circle() {
        
    }

    /** constructor with specific radius */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** return a radius - getter */
    public double getRadius() {
        return radius;
    }
    
    /** setter for radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** return the area, overriding abstract inherited GeometricObject area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override /** return the perimeter, overriding abstract inherited GeometricObject perimeter  */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** comparing two circles with radius to see if equal radius. Class returns
     * instance of a Circle and its radius and tests if it is equal to other
     * Circle objects and its radius
     */
    
    public boolean equals(Object obj) {
      
        return obj instanceof Circle && radius == ((Circle) obj).radius;
    
    }
}
