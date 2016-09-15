package javaBookExamples.bookpackext;

/**
 * Created by dip17_000 on 15.09.2016.
 */
public class ExtBook extends javaBookExamples.BookPack.book {
    private String publisher;

    public ExtBook(String t,String a,int d,String p){
        super(t,a,d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher(){ return publisher; }
    public void setPublisher(String p){ publisher = p; }

    public String getTitle() { return title; }
    public void setTitle (String t) { title = t; }
    public String getAuthor() { return author; }
    public void setAuthor(String а) { author = а; }
    public int getPubDate() { return pubDate; }
    public void setPubDate(int d) { pubDate = d; }

}