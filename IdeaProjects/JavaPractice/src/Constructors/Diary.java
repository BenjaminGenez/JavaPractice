package Practice.Hyperskill.Methods.JavaPractice.src.Constructors;

public class Diary {
    private String secret = "my entry";

    /**encapsulation is a key concept of java, by keeping it private we
     * control what we do with the public setter
     */

    public String getSecret(){

        return secret;
    }
    public void setSecret(String newSecret){
        this.secret = newSecret; // by setting a method we can later call it an create a new secret that is private?
    }
}
