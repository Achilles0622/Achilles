package a13;

public class Proxy extends Target{

    private MethodInterceptor methodInterceptor;

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }

    static Method save0;
    static Method save1;
    static Method save2;

    static {
        try {
            save0 = Target.class.getMethod("save");
            save1 = Target.class.getMethod("save",int.class);
            save2 = Target.class.getMethod("save",long.class);

        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodError(e.getMessage());
        }
    }

    //>>>>>>>>>>>>>>>>>带增强功能的方法
    @Override
    public void save() {
        try {
            methodInterceptor.intercept(this, save0, new Object[0],null);
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    @Override
    public void save(int i) {
        try {
            methodInterceptor.intercept(this, save1, new Object[]{i},null);
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    @Override
    public void save(long j) {
        try {
            methodInterceptor.intercept(this, save2, new Object[]{j},null);
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }
}