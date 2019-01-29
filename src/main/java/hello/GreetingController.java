//package hello;
package hello;

import java.util.concurrent.atomic.AtomicLong;
import hello.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
//import hello.Repository;
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
//    @Autowired
//    Repository repository;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(required=false, defaultValue="World") String name) {
        System.out.println("==== in greeting ====");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/greeting-javaconfig")
    public Greeting greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
        System.out.println("==== in greeting ====");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
//    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/greeting-posttest")
    public Greeting greetingPostTesting(@RequestBody String content) {
    	System.out.println("==== in greeting post ====");
    	Greeting newGreeting = new Greeting(counter.incrementAndGet(), content);
        return newGreeting;
    }
}
