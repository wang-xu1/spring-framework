/**
 * Created by xu on 2021-02-24
 */
public class MyBean {


    private  MyBean1 myBean1;

    private String testStr = "hello world!";

    public MyBean() {
    }

    public MyBean(MyBean1 myBean1, String testStr) {
        this.myBean1 = myBean1;
        this.testStr = testStr;
    }

    public MyBean1 getMyBean1() {
        return myBean1;
    }

    public void setMyBean1(MyBean1 myBean1) {
        this.myBean1 = myBean1;
    }

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }
}
