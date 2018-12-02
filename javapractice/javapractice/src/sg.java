public class sg {
    private int age;
    private String name;
    private String email;

    public void setEverything (int age, String name, String email){
        this.age = age;
        this.name = name;
        this.email = email;
        System.out.println("Everything is fine !!!!!:)");
    }
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}
