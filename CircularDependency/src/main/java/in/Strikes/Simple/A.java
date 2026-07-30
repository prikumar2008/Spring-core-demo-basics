package in.Strikes.Simple;

public class A {

    private B b;
    public A(B b){
        this.b = b;
    }
    public void ABC(){
        b.ABC1();
        System.out.println("ABC");
    }
    public void ABC2(){
        System.out.println("ABC2");
    }
}
