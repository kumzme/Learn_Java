package tests;

import java.io.Serializable;

public class Rectangle  implements Serializable {

    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double Area(){

        return height * width;
    }

    public double perimeter(){
        return 2 *(height +width);
    }
}
