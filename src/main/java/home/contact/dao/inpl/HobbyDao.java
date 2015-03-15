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


    @Override
    public void addHobby(Hobby hobby) {
        if (listHobby==null) listHobby  = new HashSet<Hobby>();
        listHobby.add(hobby);
    }

    @Override
    public Set<Contact> getAiiContactsWithHobby(Hobby title) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myJavaContact.xml");
        ContactDao contactDao = (ContactDao) context.getBean("ContactDao");
        List<Contact> contactList = contactDao.getContactlist();
        if (contactList == null) return null;

        for (int i = 0; i < contactList.size() ; i++) {
            for (int j = 0; j <contactList.get(i).getHobbies().size() ; j++) {
                if (contactList.get(i).getHobbies().contains(title)){
                    contactsHobbyList.add(contactList.get(i));
                }
            }

        }
        return contactsHobbyList;
    }
    public void setListHobby(Set<Hobby> listHobby) {
        this.listHobby = listHobby;
    }

    @Override
    public String toString() {
        return "HobbyDao{" +
                "listHobby=" + listHobby +
                ", contactsHobbyList=" + contactsHobbyList +
                '}';
    }
}
