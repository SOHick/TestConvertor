package ru.Sosh;


import ru.Nikita.Graphics.Convector;

public class App
{
    //public double xMin,xMax,yMin,yMax;
    public static void main( String[] args )
    {
        double xMin = -5,xMax = 5 ,yMin = -5,yMax= 5;
        int width = 200, height = 200;
        Convector a = new Convector(xMin,xMax,yMin,yMax,width,height);
        System.out.println(a.xCrt2Scr(1.0));
        System.out.println( "Hello World!" );
    }
}
