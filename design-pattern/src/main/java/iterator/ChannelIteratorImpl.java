package iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelIteratorImpl implements IChannels {
    private List<Channel> channelsList;

    public ChannelIteratorImpl() {
        this.channelsList = new ArrayList<>();
    }

    @Override
    public void add(Channel channel) {
        channelsList.add(channel);
    }

    @Override
    public void remove(Channel channel) {
        channelsList.remove(channel);
    }

    @Override
    public ChannelIterator iterator(TYPE type) {
        return new ChanellImpl(type, this.channelsList);
    }
}
