package Singleton;

public class SantaClaus {
    private static SantaClaus santa_claus;
    String command;
    private SantaClaus() {
    }
    public static SantaClaus getInstance() {
        if(santa_claus == null) {
            santa_claus = new SantaClaus();
        }
        return santa_claus;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getCommand(){
        return command;
    }
}