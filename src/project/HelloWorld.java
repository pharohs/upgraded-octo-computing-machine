package project;
import java.util.logging.Logger;

public class HelloWorld {
	private HelloWorld(){
	}
    public static void main(String[] args) {
		Logger.getLogger(HelloWorld.class).log(Level.INFO, "Hello World !");
    }
}
