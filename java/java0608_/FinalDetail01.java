package java0608_;

public class FinalDetail01
{
    public static void main(String[] args) {

    }
}
class AAAA{
    public final double TAX_RATE =0.08;
    public final double TAX_RATE2 ;
    public final double TAX_RATE3 ;


    public AAAA() {
        TAX_RATE2=1.1;

    }
    {
        TAX_RATE3=8.8;
    }
}
class BBBBBB{
    public static final double TAX_RATE=99.9;
    public static final double TAX_RATE2;
//    public static final double TAX_RATE3;
//    public BBBBBB(){
//        TAX_RATE3=8.8;
//    }

static {
    TAX_RATE2=3.3;
}

}
