class Complex extends Rational {

    double imaginary;
    public Complex(double real, double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex() {
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
}