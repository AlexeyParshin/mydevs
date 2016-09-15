// Объявление защищенными переменных экземпляра в классе Book
package javaBookExamples.BookPack;

public class book {
    protected String title;
    protected String author;
    protected int pubDate;

    public book(String t, String а, int d) {
        title = t;
        author = а;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        //System.out.println();
    }
}
