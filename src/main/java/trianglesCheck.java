public class trianglesCheck {

    public static boolean inputCheck(double s1, double s2, double s3) {
        if ( s1 <= 0 || s2 <= 0 || s3 <= 0 ) {
            return false;
        } else {
            return true;
        }
    }

    // Function to check if the given sides form a valid triangle
    public static boolean isValidTriangle(double a, double b, double c) {
        // Check the triangle inequality theorem to determine validity
        return (a + b > c && b + c > a && c + a > b);
    }

    // Function to determine the type of triangle
    public static void typeofTriangle(double x, double y, double z)
    {
        if (isValidTriangle(x, y, z)) {

            //Check for Equilateral Triangle
            if (x == y && y == z)
                System.out.println("Type of Triangle: Equilateral Triangle");

                //Check for Isosceles Triangle
            else if (x == y || y == z || z == x)
                System.out.println("Type of Triangle: Isosceles Triangle");

                //Check for Scalene Triangle
            else if (x!= y || y!= z || z!= x)
                System.out.println("Type of Triangle: Scalene Triangle");

        } else {
            System.out.println("Not a Triangle");
        }
    }
}