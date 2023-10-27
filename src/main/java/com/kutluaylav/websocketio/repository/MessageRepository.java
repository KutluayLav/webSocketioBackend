package com.kutluaylav.websocketio.repository;

import com.kutluaylav.websocketio.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {

    List<Message> findAllByRoom(String room);
}
