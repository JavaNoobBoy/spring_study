import com.jtc.dao.HelloSpringDao;
import com.jtc.dao.impl.HelloSpringDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // 原始使用方式
        HelloSpringDao helloSpringDao = new HelloSpringDaoImpl();
        helloSpringDao.helloSpring();

        // Spring方式
        // 读取容器配置文件获取容器
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        // 从容器中获取对象
        HelloSpringDao helloSpringDaoBySpring = (HelloSpringDao) applicationContext
                .getBean("helloSpringDao");
        helloSpringDaoBySpring.helloSpring();

    }
}
