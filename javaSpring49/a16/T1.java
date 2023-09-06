package a16;

static class T1{
    @Transactional
    public void foo(){
    }
    public void bar(){
    }
}

@Transactional
static class T2{
    public void foo(){}
}