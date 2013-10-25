#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class App {

    private static final ApplicationContext CONTEXT = new ClassPathXmlApplicationContext("spring-context.xml");

    private App() {}

    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}
