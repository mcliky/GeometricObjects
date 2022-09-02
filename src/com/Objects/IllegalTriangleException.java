package com.Objects;

public class IllegalTriangleException extends Exception{
    double side;

    IllegalTriangleException(double side){
     super("side that is equal to " + side + " is bigger or equal to sum of two other sides");
    }


}
