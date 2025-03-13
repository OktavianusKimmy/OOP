public class Main{
    public Main(){
        Student s1 = new Student();
        Address adr = new Address("Bogor");
        PublicPlace p = new PublicPlace("Kebun Raya Bogor");
        s1.address = adr;
        s1.visit(p);
    }
}
