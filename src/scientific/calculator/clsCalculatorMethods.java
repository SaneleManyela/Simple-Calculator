/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientific.calculator;

/**
 *
 * @author Sanele
 */
public class clsCalculatorMethods {
    
    public double mAddition(double x, double y)
    {
        return (x + y);
    }
    
    public double mSubtract(double x, double y)
    {
        return (x - y);
    }
    
    public double mMultiply(double x, double y)
    {
        return (x * y);
    }
    
    public double mDivide(double x, double y)
    {
        return (x / y);
    }
    
    public double mModulo(double x, double y)
    {
        return (x % y);
    }
    
    public double mSin(double x)
    {
        return Math.sin(x);
    }
    
    public double mCos(double x)
    {
        return Math.cos(x);
    }
    
    public double mTan(double x)
    {
        return Math.tan(x);
    }
    
    public double mSqrt(double x)
    {
        return Math.sqrt(x);
    }
    
    public double mAbs(double x)
    {
        return Math.abs(x);
    }
    
    public int mFarenheitToCelsius(int fahrenheit)
    {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public int mCelsiusToFahrenheit(int celsius)
    {
        return (int)(celsius * 1.8) + 32;
    }
    
    public double mMilesToKilometres(double miles)
    {
        return (miles * 1.609);
    }
    
    public double mKilometresToMiles(double km)
    {
        return (km * 0.621);
    }
    
    public double mMetresToCentimetres(double m)
    {
        return (m * 100);
    }
    
    public double mCentimetresToMetres(double cm)
    {
        return (cm * 0.01);
    }
    
    public double mKilogramsToPounds(double kg)
    {
        return (kg * 2.204622);
    }
    
    public double mPoundsToKilograms(double lbs)
    {
        return (lbs * 0.454);
    }
    
}
