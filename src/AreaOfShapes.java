import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
        /*
        Create methods to calculate the area of specific shapes.
        For circles take radius.
        For triangles take base and height.
        For rectangles take length and width.
        For squares take length of one side.
         */
        Scanner scn = new Scanner(System.in);

        System.out.println("Which shape would you like to calculate the area for? \n'circle', 'triangle', 'rectangle', or 'square'");
        String user_shape = scn.nextLine();
        if(user_shape.equalsIgnoreCase("circle")){
            System.out.println("Enter the radius: ");
            double radius = scn.nextDouble();
            circle_area(radius);
        }
        else if(user_shape.equalsIgnoreCase("triangle")){
            System.out.println("Enter the base: ");
            double base = scn.nextDouble();
            System.out.println("Enter the height");
            double height = scn.nextDouble();
            triangle_area(base, height);
        }
        else if(user_shape.equalsIgnoreCase("rectangle")){
            System.out.println("Enter the length: ");
            double length = scn.nextDouble();
            System.out.println("Enter the width: ");
            double width = scn.nextDouble();
            rectangle_area(length, width);
        }
        else if(user_shape.equalsIgnoreCase("square")){
            System.out.println("Enter the length of one side: ");
            double length = scn.nextDouble();
            square_area(length);
        }


    }
    public static double circle_area(double radius){
        double area = 3.14*Math.pow(radius, 2);
        System.out.println("The area of a circle with a radius \nof length "+radius+" is "+area);
    return area;}
    public static double triangle_area(double base, double height){
        double area = 0.5*base*height;
        System.out.println("The area of a triangle with a base \nof "+base+"and a height of "+height+" is "+area);
    return area;}
    public static double rectangle_area(double length, double width){
        double area = length*width;
        System.out.println("The area of a rectangle with a length \nof "+length+" and a width of "+width+" is "+area);
    return area;}
    public static double square_area(double side_length){
        double area = Math.pow(side_length, 2);
    return area;}

}
