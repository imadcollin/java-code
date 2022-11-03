package iterator;

import java.util.List;

public class ChanellImpl implements ChannelIterator {
    private TYPE type;
    private List<Channel> chanellList;
    private int index = 0;

    public ChanellImpl(TYPE type, List<Channel> channelsList) {
        this.type = type;
        this.chanellList = channelsList;
        this.index = channelsList.size();
    }

    @Override
    public boolean hasNext() {
        if (!chanellList.isEmpty() && index >= 0) {
            return chanellList.size() > 0 && chanellList.size() > index--;
        } else
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
