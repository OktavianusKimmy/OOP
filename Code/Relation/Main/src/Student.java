public class Name{
    public String firstName;
    public String middleName;
    public String lastName;
}

public class Student {
    Name name;
    Address address;

    public Student(){
        name = new Name();
    }

    public void visit(PublicPlace p){

    }
}