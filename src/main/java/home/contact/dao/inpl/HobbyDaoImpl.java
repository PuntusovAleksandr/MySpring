package home.contact.dao.inpl;

import home.contact.dao.HobbyDao;
import home.contact.model.Contact;
import home.contact.model.Hobby;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class HobbyDaoImpl implements HobbyDao {

    private Set<Hobby> listHobby;

    @Override
    public void addHobby(Hobby hobby) {
        if (listHobby==null) listHobby  = new HashSet<Hobby>();
        listHobby.add(hobby);
    }

    @Override
    public Set<Contact> getAiiContactsWithHobby(Hobby title) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myJavaContact.xml");
        ContactDaoImpl contactDaoImpl = (ContactDaoImpl) context.getBean("ContactDao");
        List<Contact> contactList = contactDaoImpl.getContactlist();
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
    public Set<Hobby> getHobbies() {
        return listHobby;
    }

    public void setListHobby(Set<Hobby> listHobby) {
        this.listHobby = listHobby;
    }


}
