import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);


    Complex getValue() {
        Complex c = new Complex();
        System.out.print("Целая часть ");
        c.setReal(in.nextDouble());
        System.out.print("Мнимая часть ");
        c.setImaginary(in.nextDouble());
        return c;
    }

    String print(String title, Complex result) {

        StringBuilder sb = new StringBuilder();

        if (result.getImaginary() >= 0)
            sb.append(String.format("%s%.2f+%.2fi", title, result.getReal(), result.getImaginary()));

        else
        sb.append(String.format("%s%.2f %.2fi", title, result.getReal(), result.getImaginary()));
        return sb.toString();

    }

}