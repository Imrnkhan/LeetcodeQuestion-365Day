package DefaultAndStaticMethod;

public class WebDeveloper implements Developer{
    @Override
    public void develop() {
        System.out.println("i am webdeveloper");
    }

    @Override
    public void test() {
        System.out.println("i am web test developer");

    }
}
