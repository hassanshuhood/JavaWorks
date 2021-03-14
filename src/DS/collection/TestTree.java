package DS.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        TreeSet<Book> tree = new TreeSet<Book>();

        class compared implements Comparator<Book>{

            @Override
            public int compare(Book o1, Book o2) {
                // TODO Auto-generated method stub
                return o2.getTitle().compareTo(o1.getTitle());
            }

        }
        

        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);

        TreeSet<Book> treeSet = new TreeSet<>(new compared());

        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b3);
        System.out.println(treeSet);
    }
}

class Book implements Comparable<Book>{
    String title;

    public Book(String t) {
    title = t;
    }

    @Override
    public int compareTo(Book o) {
        // TODO Auto-generated method stub
        return this.title.compareTo(o.getTitle());
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return title;

    }
}