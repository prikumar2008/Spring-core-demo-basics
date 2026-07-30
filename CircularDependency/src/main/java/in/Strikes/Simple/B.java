package in.Strikes.Simple;

public class B {
    private A a;
    public B(A a){
        this.a = a;
    }
    public void ABC1(){
        System.out.println("ABC1");
        a.ABC2();
    }
}
