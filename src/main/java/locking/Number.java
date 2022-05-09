package locking;

public class Number extends Thread {
    private int num = 0 ;

    private void add(int value){
        this.num=this.num+value;
    }
}
