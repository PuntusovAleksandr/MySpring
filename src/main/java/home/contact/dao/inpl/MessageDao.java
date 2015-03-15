package home.contact.dao.inpl;


import home.contact.model.Contact;
import home.contact.model.MessageContact;
import home.contact.dao.InterfaceMessageDao;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class MessageDao implements InterfaceMessageDao {
    private List<MessageContact> messagesContacts = new LinkedList<MessageContact>();

    @Override
    public void storeMessage(MessageContact message) {
        messagesContacts.add(message);
    }

    @Override
    public List<MessageContact> getConversation(Contact contactOne, Contact contactTwo) {
        List<MessageContact> messageConversation = new LinkedList<MessageContact>();
        if (messagesContacts==null) return null;
        for (MessageContact mess : messagesContacts){
            if (mess.getFrom().equals(contactOne) && mess.getTo().equals(contactTwo) ||
                    mess.getFrom().equals(contactTwo) && mess.getTo().equals(contactOne)){
                messageConversation.add(mess);
            }
        }
        return messageConversation;
    }
}
