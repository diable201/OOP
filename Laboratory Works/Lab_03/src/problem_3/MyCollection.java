package problem_3;

public interface MyCollection<E> {
    int size();
    void clear();
    boolean isEmpty();
    boolean add(E o);
    boolean addAll(MyCollection<E> collection);
    boolean remove(E o);
    boolean contains(E o);
    boolean containsAll(MyCollection<E> collection);
    MyCollection<E> union(MyCollection<E> collection);
    MyCollection<E> intersection(MyCollection<E> collection);
    MyCollection<E> difference(MyCollection<E> collection);
    boolean isDisjoint(MyCollection<E> collection);
}

