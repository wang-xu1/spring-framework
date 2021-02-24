import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by xu on 2021-02-24
 */
public class MyBeanTest {
    @Test
    public void test1() {
        BeanFactory bf = new XmlBeanFactory( new ClassPathResource("spring-config.xml"));
        MyBean myTestBean = (MyBean) bf.getBean("myBean");
        System.out.println(myTestBean.getTestStr());
    }
}
