package home.contact.dao;

import home.contact.model.Contact;
import home.contact.model.MessageContact;

import java.util.List;

/**
 * Created by Aleksandr on 11.03.2015.
 */
public interface InterfaceMessageDao {
    public void storeMessage(MessageContact message);
    public List<MessageContact> getConversation(Contact contactOne, Contact contactTwo);
}
