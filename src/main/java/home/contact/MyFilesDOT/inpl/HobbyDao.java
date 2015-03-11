package home.contact.MyFilesDOT.inpl;

import home.contact.CoreMyCpring.Contact;
import home.contact.CoreMyCpring.Hobby;
import home.contact.MyFilesDOT.InterfaceHobbyDao;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class HobbyDao implements InterfaceHobbyDao {

    private Set<Hobby> listHobby = new HashSet<Hobby>();

    @Override
    public void addHobby(Hobby title) {
        listHobby.add(title);
    }

    @Override
    public Set<Contact> getAiiContactsWithHobby(Hobby title) {
        return null;
    }
    public void setListHobby(Set<Hobby> listHobby) {
        this.listHobby = listHobby;
    }


    @Override
    public String
    toString() {
        return "HobbyDao{" +
                "listHobby=" + listHobby +
                '}';
    }
}
