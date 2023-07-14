package java0610_;

public class ClassCastException {
    public static void main(String[] args) {
        AA b = new BB();
        BB b2 = (BB) b;
        CC c2=(CC)b;
    }
}

class AA {
}

class BB extends AA {
}

class CC extends AA {
}