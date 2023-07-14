public class main {
    public static void main(String[] args) {
        //1.abs绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);//9
        //2.pow求幂
        double pow = Math.pow(2, 4);
        System.out.println(pow);//16
        //3.ceil向上取整
        double ceil = Math.ceil(-3.0001);
        System.out.println(ceil);//-3
        //4.floor向下取整
        double floor = Math.floor(-9.999);
        System.out.println(floor);//-10
        //5.round4舍5入
        long round = Math.round(5.001);
        System.out.println(round);//5
        //6.sqrt求开方
        double sqrt = Math.sqrt(9);
        System.out.println(sqrt);//3
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());

        }

    }
}
