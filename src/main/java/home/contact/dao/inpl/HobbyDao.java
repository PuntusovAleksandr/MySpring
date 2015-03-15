package home.contact.dao.inpl;

import home.contact.dao.InterfaceHobbyDao;
import home.contact.model.Contact;
import home.contact.model.Hobby;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class HobbyDao implements InterfaceHobbyDao {

    private Set<Hobby> listHobby;
    private Set<Contact> contactsHobbyList = new HashSet<Contact>();
    private List<Contact> contactList;

    @Override
    public void addHobby(Hobby hobby) {
        if (listHobby==null) listHobby  = new HashSet<Hobby>();
        listHobby.add(hobby);
    }

    @Override
    public Set<Contact> getAiiContactsWithHobby(Hobby title) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myJavaContact.xml");
        ContactDao contactDao = (ContactDao) context.getBean("ContactDao");

        if (contactsHobbyList == null) return null;
        contactList = contactDao.getContactlist();
        for (int i = 0; i < contactList.size() ; i++) {
            if (contactList.get(i).getHobbies().equals(title)){
                contactsHobbyList.add(contactList.get(i));
            }
        }
        return contactsHobbyList;
    }
    public void setListHobby(Set<Hobby> listHobby) {
        this.listHobby = listHobby;
    }

    @Override
    public String toString() {
        return "HobbyDao : " +
                "listHobby= " + listHobby +
                ", contactsHobbyList= " + contactsHobbyList +
                ", contactList= " + contactList;
    }
}
