package records;

public record Students(String name, String subject, int age) implements dummy {
    public Students{
        if(name.length()==0||subject.length()==0||age<=21)
            throw new RuntimeException("Cannot use these values");
        name = name.toUpperCase();
        subject = subject.toUpperCase();
    }
    public Students(String firstname, String lastname){
        this(firstname+ " "+ lastname,"Java",30);
    }

    @Override
    public void IQ() {
        System.out.println("High IQ");
    }

    @Override
    public void level() {
        System.out.println("High Level");
    }
}
