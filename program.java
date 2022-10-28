public class program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new View(), new SumModel());
        p.clickButton();
    }
}
