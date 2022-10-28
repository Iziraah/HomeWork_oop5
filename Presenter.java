public class Presenter {
    View v;
    Model m;
 
    Presenter(View v, Model m){
     this.v = v;
     this.m = m;
    }
 
    void clickButton(){
        Complex a = v.getValue();
        Complex b = v.getValue();
        m.setA(a);
        m.setB(b);
        Complex result = m.result();
        System.out.println(result);
    }
 }
