interface A{
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A{
    abstract void bancho();
    public void c(){System.out.println("I am C");}
}

class M extends B{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}

    @Override
    void bancho() {
        System.out.println("Bancho is brother of Sameer Fuddi");
    }
}

class Test5{
    public static void main(String args[]){
        A a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
        M m=new M();
        m.bancho();
    }}
