package hspedu.extend.exercise;

public class PC extends Computer {
    private String brand;

    //这里提现继承设计的基本思想，父类的构造器完成父类属性初始化
    //子类完成子类初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息如下=");
//        System.out.println(getCpu()+getMemory()+getDisk());
        System.out.println(getDetails()+"brand="+brand);
    }
}
