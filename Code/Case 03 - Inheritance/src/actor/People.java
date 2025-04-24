package actor;

public abstract class People {
    public String code;
    public String name;
    public String dob;

    public People(String code, String name, String dob) {
        this.code = code;
        this.name = name;
        this.dob = dob;
    }
}
