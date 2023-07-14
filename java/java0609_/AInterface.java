package java0609_;

public interface AInterface {
    public int n1=10;
    public void hi();
    default public void ok(){
        System.out.println("ok----------");
    }
    default public void cry(){
        System.out.println("cry------");
    }

}

