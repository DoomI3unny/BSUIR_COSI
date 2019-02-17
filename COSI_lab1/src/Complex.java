public class Complex
{
    private final double real;
    private final double imaginary;

    public Complex(double real)
    {
        this.real = real;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double GetReal()
    {
        return this.real;
    }

    public double GetImaginary()
    {
        return this.imaginary;
    }

    public Complex Conjugate()
    {
        return new Complex(this.real, -this.imaginary);
    }

    public double Absolute()
    {
        return Math.sqrt(this.SquareLenght());
    }

    public double Phase()
    {
        return Math.atan2(this.imaginary, this.real);
    }

    public double SquareLenght()
    {
        return this.real * this.real + this.imaginary * this.imaginary;
    }

    public Complex Add(Complex number)
    {
        return new Complex(this.real + number.real, this.imaginary + number.imaginary);
    }

    public Complex Subtract(Complex number)
    {
        return new Complex(this.real - number.real, this.imaginary - number.imaginary);
    }

    public Complex Multiply(Complex number)
    {
        double real = this.real * number.real - this.imaginary * number.imaginary;
        double imaginary = this.real * number.imaginary + this.imaginary * number.real;

        return new Complex(real, imaginary);
    }

    public Complex Divide(Complex number)
    {
        double divider = number.SquareLenght();

        double real = (this.real * number.real + this.imaginary * number.imaginary) / divider;
        double imaginary = (this.imaginary * number.real - this.real * number.imaginary) / divider;

        return new Complex(real, imaginary);
    }
}
