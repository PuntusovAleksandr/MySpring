package home.contact.MyFilesDOT.inpl;


import home.contact.CoreMyCpring.Contact;
import home.contact.CoreMyCpring.MessageContact;
import home.contact.MyFilesDOT.InterfaceMessageDao;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class MessageDao implements InterfaceMessageDao {
    private List<MessageContact> messagesContacts;
    private List<MessageContact> messageConversation;

    @Override
    public void storeMessage(MessageContact message) {
        if (message == null){
            messagesContacts = new LinkedList<MessageContact>();
        }
        messagesContacts.add(message);
    }

    @Override
    public List<MessageContact> getConversation(Contact contactOne, Contact contactTwo) {
        if (messagesContacts==null) return null;
        messageConversation = new LinkedList<MessageContact>();
        for (MessageContact mess : messagesContacts){
            if (mess.getFrom().equals(contactOne) && mess.getTo().equals(contactTwo) ||
                    mess.getFrom().equals(contactTwo) && mess.getTo().equals(contactOne)){
                messageConversation.add(mess);
            }
        }
        return messagesContacts;
    }
}
