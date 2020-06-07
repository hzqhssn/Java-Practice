public class ComplexNumber {
    private double real;
    private double imaginary;

  public ComplexNumber(double real, double imaginary)
  {
      this.real =  real;
      this.imaginary = imaginary;
  }

  public double getReal()
  {
      return this.real;
  }

  public double getImaginary()
  {
      return this.imaginary;
  }

  public void add(double real, double imaginary)
  {
      ComplexNumber add = new ComplexNumber(real, imaginary);
      add(add);

  }

    public void add(ComplexNumber other)
    {
        this.real = this.real + other.real;
        this.imaginary = this.imaginary + other.imaginary;
    }

    public void subtract(double real, double imaginary)
    {
        ComplexNumber subtract = new ComplexNumber(real, imaginary);
        subtract(subtract);
    }

    public void subtract(ComplexNumber other)
    {
        this.real = this.real - other.real;
        this.imaginary = this.imaginary - other.imaginary;
    }
}
