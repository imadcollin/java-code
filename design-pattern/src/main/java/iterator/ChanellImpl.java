package iterator;

import java.util.List;

public class ChanellImpl implements ChannelIterator {
    private TYPE type;
    private List<Channel> chanellList;
    private int index = 0;

    public ChanellImpl(TYPE type, List<Channel> channelsList) {
        this.type = type;
        this.chanellList = channelsList;
    }

    @Override
    public boolean hasNext() {
        while (index< chanellList.size()) {
            Channel c = chanellList.get(index);
            if (c.getType().equals(type)) {
                return true;
            }else
                index++;
    }
        return false;
    }

    @Override
    public Channel next() {
        if (!chanellList.isEmpty()) {
            return chanellList.get(index++);
        }
        return null;
    }
}
