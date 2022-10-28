class SumModel extends  CalcModel {

    @Override
    public Complex result() {
        double newReal = super.b.getReal() + super.a.getReal();
        double newImaginary = super.b.getImaginary() + super.a.getImaginary();
        Complex result = new Complex(newReal, newImaginary);

        return result;
    }

    @Override
    public void setA(Complex c) {
        super.a.real = c.getReal();
        super.a.imaginary = c.getImaginary();
    }

    @Override
    public void setB(Complex c) {
        super.b.real = c.getReal();
        super.b.imaginary = c.getImaginary();
    }
}