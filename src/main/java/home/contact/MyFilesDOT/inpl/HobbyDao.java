package home.contact.MyFilesDOT.inpl;

import home.contact.CoreMyCpring.Contact;
import home.contact.CoreMyCpring.Hobby;
import home.contact.MyFilesDOT.InterfaceHobbyDao;

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
        if (contactsHobbyList == null) return null;
        contactList = new ContactDao().getContactlist();
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
