public class Greeter {
    public String who;

    public Greeter(String who){
        this.who = who;
    }

    public void say(String what)
{
    System.out.println(who + " says: " + what);
}    
}
