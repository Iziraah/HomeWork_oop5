public class MultModel extends CalcModel {

    @Override
    public Complex result() {
        double newReal = super.b.getReal()*super.a.getReal() - super.b.getImaginary()*super.a.getImaginary();
        double newImaginary = super.b.getImaginary()*super.a.getReal() + super.a.getImaginary()*super.b.getReal();
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