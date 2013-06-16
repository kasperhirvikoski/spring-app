#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class App {

    private App() {}

    public static void main(String[] args) {

        final ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        System.out.println("Hello World!");
    }
}
