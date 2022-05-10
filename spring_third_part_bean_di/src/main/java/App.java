import com.jtc.Test4PropShow;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {

    public static void main(String[] args) {

        // Spring方式
        // 读取容器配置文件获取容器
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println("dataSource = " + dataSource);

        Test4PropShow propShow = (Test4PropShow) applicationContext.getBean("propShow");
        System.out.println("propShow = " + propShow);
    }
}
