package hello.app;

import hello.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

interface NumericTest {
	int computeTest(int x, int y);
}

@SpringBootApplication(scanBasePackages = "hello")
@RestController
public class DemoApplication {

  private final MyService myService;
  private final List<Integer> myList = new ArrayList<Integer>();

  public DemoApplication(MyService myService) {
    this.myService = myService;
  }

  @GetMapping("/")
  public String home() {
    for(int i=0; i<10; i++) {
      myList.add(i);
    }

    myList.forEach(new Consumer<Integer>() {
      public void accept(Integer t) {
        System.out.println("forEach anonymous class Value: " + t);
      }
    });

    NumericTest z = (int x, int y) -> x * y;
    System.out.println(z.computeTest(4, 9));

    return myService.message();
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
