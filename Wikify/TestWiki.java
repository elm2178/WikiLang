import wiki.type.*;
public class TestWiki { 
public static void main(String[] args) {
Page  p1 = new Page ();
p1.url("http://wikipedia.org/wiki/China");
System.out.print(p1.getUrl()+"\n");
}
}
