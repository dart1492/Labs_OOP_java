package lab3;
import java.util.Scanner;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(){
        real = 1;
        imaginary = 1;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public void input(){
        Scanner scan = new Scanner(System.in);
        this.real = scan.nextInt();
        this.imaginary = scan.nextInt();
    }

    Complex add(Complex second){
        return new Complex(this.real + second.real, this.imaginary + second.imaginary);
    }

    Complex subtract(Complex second){
        return new Complex(this.real - second.real, this.imaginary - second.imaginary);
    }

    Complex multiply(Complex second){
        int real = (this.real * second.real) - (this.imaginary * second.imaginary);
        int imaginary = (this.real * second.imaginary) + (this.imaginary * second.real);
        return new Complex(real, imaginary);
    }

    Complex divide(Complex second){
        int real = (this.real * second.real + this.imaginary * second.imaginary)/(second.real * second.real) + (second.imaginary * second.imaginary);
        int imaginary = (this.imaginary * second.real - this.real * second.imaginary)/(second.real * second.real) + (second.imaginary * second.imaginary);
        return new Complex(real, imaginary);
    }



}
