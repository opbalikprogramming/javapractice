public class sgMain {
    public static void main(String[] args) {
        sg sgobj = new sg();
        sgobj.setEverything(24,"Derby","derbysalvacion@gmail.com");
        System.out.println("Your age is "+sgobj.getAge());
        System.out.println("Your name is "+sgobj.getName());
        System.out.println("Your email is "+sgobj.getEmail());
    }
}
