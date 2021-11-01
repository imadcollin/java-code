package booleans;

public class OneBeginner {
    public static boolean check(Object[] a, Object x) {
        for( Object el : a){
            if( el.equals(x)) return true;
        }
        return false ;
    }

}
