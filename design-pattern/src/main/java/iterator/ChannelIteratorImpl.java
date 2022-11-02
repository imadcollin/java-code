package iterator;

public class ChannelIteratorImpl implements ChannelIterator, IChannels{
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Channel next() {
        return null;
    }

    @Override
    public void add(Channel channels) {

    }

    @Override
    public void remove(Channel channels) {

    }

    @Override
    public ChannelIterator iterator(TYPE type) {
        return null;
    }
}
