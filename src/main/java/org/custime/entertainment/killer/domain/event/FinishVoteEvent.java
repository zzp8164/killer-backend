package org.custime.entertainment.killer.domain.event;

public class FinishVoteEvent {

    private final String votePlayerName;

    public FinishVoteEvent(final String votePlayerName) {
        this.votePlayerName = votePlayerName;
    }

    public String getVotePlayerName() {
        return votePlayerName;
    }
}
