package home.contact.dao.inpl;

import home.contact.dao.ContactDao;
import home.contact.dao.HobbyDao;
import home.contact.model.Contact;
import home.contact.model.Hobby;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class HobbyDaoImpl implements HobbyDao {

    private Set<Hobby> listHobby;
    @Autowired
    private ContactDao contactDao;

    @Override
    public Set<Contact> getAiiContactsWithHobby(Hobby title) {

        List<Contact> contactList = contactDao.getContactlist();
        if (contactList == null) return null;
        Set<Contact> contactsHobbyList = new HashSet<Contact>();
        for (int i = 0; i < contactList.size() ; i++) {
            for (int j = 0; j <contactList.get(i).getHobbies().size() ; j++) {
                if (contactList.get(i).getHobbies().contains(title)){
	                //TODO Здесь неразумно использовать глобальную переменную, ибо на каждом методе будешь в нее добавлять
	                //лучше создавай локальную переменную в методе и уже в нее накидывай подходящие контакты
                    contactsHobbyList.add(contactList.get(i));
                }
            }
        }
        return contactsHobbyList;
    }

    @Override
    public void addHobby(Hobby hobby) {
        if (listHobby==null) listHobby  = new HashSet<Hobby>();
        listHobby.add(hobby);
    }

    @Override
    public Set<Hobby> getHobbies() {
        return listHobby;
    }

    public void setListHobby(Set<Hobby> listHobby) {
        this.listHobby = listHobby;
    }


}
