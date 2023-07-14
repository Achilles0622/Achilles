package java0609_;

public class InterFace01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);
        System.out.println("-----------------------");
        computer.work(camera);

    }
}
