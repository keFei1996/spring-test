package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpring {
    public static void main(String[] args) {
        System.out.println("applicationSpring");

        //  初始化spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);

        printer.printMessage();
    }
}
