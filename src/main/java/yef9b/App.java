package yef9b;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App {
    
    @Autowired

    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
    }
}