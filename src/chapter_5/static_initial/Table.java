package chapter_5.static_initial;

import utils.Print;

public class Table {
    static Bowl bowl1=new Bowl(1);
    Table(){
        Print.print("Table");
        bowl2.f1(1);
    }
    void f2(int marker){
        Print.print("f2("+marker+")");
    }
    static Bowl bowl2=new Bowl(2);
}
