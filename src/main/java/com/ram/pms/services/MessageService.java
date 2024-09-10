package com.ram.pms.services;

import com.ram.pms.entity.Message;
import com.ram.pms.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getMessagesByConversation(Long conversationId) {
        return messageRepository.findByConversationId(conversationId);
    }

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }
}
