package home.contact.dao.inpl;


import home.contact.dao.MessageDao;
import home.contact.model.Contact;
import home.contact.model.Message;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class MessageDaoImpl implements MessageDao {
    private List<Message> messagesContacts = new LinkedList<Message>();

    @Override
    public void storeMessage(Message message) {
        messagesContacts.add(message);
    }

    @Override
    public List<Message> getConversation(Contact contactOne, Contact contactTwo) {
        if (messagesContacts == null) return null;
        List<Message> messageConversation = new LinkedList<Message>();
        for (Message mess : messagesContacts) {
            //TODO е забудь, что для корректной работы equals ты его должен переопределить - Яздесь переделал под IdContact
            //а поскольку ты работаешь с HashSet, то и hashCode тоже (в целом так нужно сделать для всех DTO)
            if (mess.getFrom().getIdContact() == (contactOne.getIdContact()) && mess.getTo().getIdContact() == (contactTwo.getIdContact()) ||
                    mess.getFrom().getIdContact() == (contactTwo.getIdContact()) && mess.getTo().getIdContact() == (contactOne.getIdContact())) {
                messageConversation.add(mess);
            }
        }
        return messageConversation;
    }

    @Override
    public String toString() {
        return "MessageDaoImpl{" + messagesContacts +
                '}';
    }
}
