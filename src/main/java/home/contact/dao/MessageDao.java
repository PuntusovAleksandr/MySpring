package home.contact.dao;

import home.contact.model.Contact;
import home.contact.model.Message;

import java.util.List;

/**
 * Created by Aleksandr on 11.03.2015.
 */
public interface MessageDao {
    public void storeMessage(Message message);
    public List<Message> getConversation(Contact contactOne, Contact contactTwo);
}
