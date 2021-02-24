/**
 * Created by xu on 2021-02-24
 */
public class MyBean1 {

    private  MyBean myBean;

    public MyBean1() {
    }

    public MyBean1(MyBean myBean) {
        this.myBean = myBean;
    }


    public MyBean getMyBean() {
        return myBean;
    }

    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }
}
