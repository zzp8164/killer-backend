package org.custime.entertainment.killer.domain;

import org.custime.entertainment.killer.domain.model.Room;
import org.custime.entertainment.killer.domain.repository.RoomRepository;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class RoomTest {

    private RoomRepository roomRepository = new RoomRepository();

    @Test
    public void testCreateRoom() {
        Room room = roomRepository.createRoom();
        assertThat(room, notNullValue());
    }

}