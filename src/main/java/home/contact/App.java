package home.contact;

import home.contact.service.impl.JavaContactService;
import home.contact.model.Contact;
import home.contact.dao.inpl.ContactDao;
import home.contact.dao.inpl.HobbyDao;
import home.contact.dao.inpl.MessageDao;
import home.contact.dao.inpl.PlaceDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

/**
 * Created by Aleksandr on 08.03.2015.
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myJavaContact.xml");
        JavaContactService javaContactService = (JavaContactService) context.getBean("JavaContact");

        ContactDao contactDao = (ContactDao) context.getBean("ContactDao");
        HobbyDao hobbyDao = (HobbyDao) context.getBean("HobbyDao");
        PlaceDao placeDao = (PlaceDao) context.getBean("PlaceDao");
        MessageDao messageDao = (MessageDao) context.getBean("MessegeDao");
        System.out.println(contactDao.toString());
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");
        contactDao.deleteContact((Contact) context.getBean("Contact3"));
        System.out.println(contactDao.toString());
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");

        Contact contact = (Contact) context.getBean("Contact1");
        Contact contact1 =(Contact) context.getBean("Contact5");

//        contactDao.addFriendShip(((Contact) context.getBean("Contact1")),((Contact) context.getBean("Contact5")));
//        contactDao.addFriendShip(contact, contact1);
        javaContactService.createContact("Monja", "Figoc", LocalDate.ofEpochDay(2005-07-06));
        javaContactService.createContact("Dunja", "Mirova", LocalDate.ofEpochDay(1885-07-06));
        javaContactService.createContact("Вак", "Xprior", LocalDate.ofEpochDay(2020-07-06));

        System.out.println(contactDao.getContactFriendShipList());
        System.out.println("Contacts : "+contactDao.countContact());
        javaContactService.addHobby("I like see", "Swing");
        System.out.println(javaContactService.getHobbyDao());

        javaContactService.addPlace("Little city","Nikoppol",65.568156, 45.4984 );

        System.out.println("___________________________________________________");
        contactDao.deleteContact((Contact) context.getBean("Contact3"));
        System.out.println(contactDao.toString());
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");

    }
}
