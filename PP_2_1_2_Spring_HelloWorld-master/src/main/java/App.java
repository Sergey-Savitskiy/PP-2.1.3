import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        System.out.println(bean == bean1);

        Cat bean2 = (Cat) applicationContext.getBean("getCat", Cat.class);
        bean2.setVoice("Мяяяу");
        Cat bean3 = (Cat) applicationContext.getBean("getCat", Cat.class);
        bean3.setVoice("Мяу");
        System.out.println(bean2.getVoice());
        System.out.println(bean3.getVoice());
        System.out.println(bean2 == bean3);
    }
}