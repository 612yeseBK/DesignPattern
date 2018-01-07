package publish_subscribe.javaObservable;

public class TestObserver {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Student student = new Student("张三",teacher);
        teacher.setHomework("数学");
    }
}
