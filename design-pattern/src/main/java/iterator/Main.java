package iterator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C");
        MyIterator iterator = new MyIterator(stringList);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Channel c1 = new Channel(1, "A", TYPE.ARABIC);
        Channel c2 = new Channel(2, "B", TYPE.ENGLISH);
        Channel c3 = new Channel(3, "C", TYPE.FRENCH);
        Channel c4 = new Channel(4, "F", TYPE.ARABIC);
        Channel c5 = new Channel(5, "G", TYPE.ARABIC);

        List<Channel> list = Arrays.asList(c1, c2, c3);
        ChannelIteratorImpl impl = new ChannelIteratorImpl();
        impl.add(c1);
        impl.add(c2);
        impl.add(c3);
        impl.add(c4);
        impl.add(c5);

        ChannelIterator arabic = impl.iterator(TYPE.ARABIC);
        while (arabic.hasNext()) {
            Channel ch = arabic.next();
            System.out.println(String.format("%s\t%s\t%s", ch.getIdx(), ch.getName(), ch.getType()));
        }

        ChannelIterator french = impl.iterator(TYPE.FRENCH);
        while (french.hasNext()) {
            Channel ch = french.next();
            System.out.println(String.format("%s\t%s\t%s", ch.getIdx(), ch.getName(), ch.getType()));
        }
    }
}
