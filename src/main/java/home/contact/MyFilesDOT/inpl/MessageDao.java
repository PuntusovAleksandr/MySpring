package home.contact.MyFilesDOT.inpl;


import home.contact.CoreMyCpring.Contact;
import home.contact.CoreMyCpring.MessageContact;
import home.contact.MyFilesDOT.InterfaceMessageDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class MessageDao implements InterfaceMessageDao {
    private List<MessageContact> messageContacts = new ArrayList<MessageContact>();

    @Override
    public void storeMessage(MessageContact message) {
        messageContacts.add(message);
    }

    @Override
    public List<MessageContact> getConversation(Contact contactOne, Contact contactTwo) {
        return messageContacts;
    }
}
