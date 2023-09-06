package a12;

public class $Proxy0 implements Foo {

    private InvocationHandler handler;

    public $Proxy0(InvocationHandler handler) {
        this.handler = handler;
    }

    @Override
    public void foo() {
        handler.invoke();

    }
}