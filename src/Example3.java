/**
 * Created by dip17_000 on 28.09.2016.
 */

class foo{
    private int x;

    foo(int i){
        x = i;
    }
    void gen(int _i){
        foo ff = new foo(_i);
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Calling..." + x);
    }
}


public class Example3{
    public static void main(String[] args) {
        foo tt = new foo(0);

        for(int i=0;i<1000000;i++){
            tt.gen(i);
        }
    }
}
