package iterator;

public interface IChannels {
    void  add(Channel channels);
    void remove(Channel channels);
    ChannelIterator iterator(TYPE type);

}
