package Generic;

/**
 * 自定义的泛型
 * @param <E>
 */
public class Value<E> {
    private E e;


    public void setE(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }
}
