package home.contact;

import home.contact.dao.inpl.ContactDaoImpl;
import home.contact.dao.inpl.HobbyDaoImpl;
import home.contact.dao.inpl.MessageDaoImpl;
import home.contact.dao.inpl.PlaceDaoImpl;
import home.contact.model.Contact;
import home.contact.model.Place;
import home.contact.service.impl.JavaContactService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Aleksandr on 08.03.2015.
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myJavaContact.xml");
        JavaContactService javaContactService = (JavaContactService) context.getBean("JavaContact");

        ContactDaoImpl contactDao = (ContactDaoImpl) context.getBean("ContactDaoImpl");
        HobbyDaoImpl hobbyDao = (HobbyDaoImpl) context.getBean("HobbyDaoImpl");
        PlaceDaoImpl placeDao = (PlaceDaoImpl) context.getBean("PlaceDaoImpl");
        MessageDaoImpl messageDao = (MessageDaoImpl) context.getBean("MessageDaoImpl");



        System.out.println(javaContactService.toString());
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");
        contactDao.deleteContact((Contact) context.getBean("Contact3"));
        System.out.println(javaContactService.toString());
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");

        Contact contact1 = (Contact) context.getBean("Contact1");
        Contact contact2 = (Contact) context.getBean("Contact2");
        Contact contact3 = (Contact) context.getBean("Contact3");
        Contact contact4 = (Contact) context.getBean("Contact4");
        Contact contact5 =(Contact) context.getBean("Contact5");

        System.out.println("Id"+contact5.getIdContact());
        System.out.println("___________________________________________________");

        Place dnepr = (Place) context.getBean("PlaceDnepr");
        Place kiev = (Place) context.getBean("PlaceKiev");
        Place odessa = (Place) context.getBean("PlaceOdessa");

        javaContactService.createContact("Monja", "Figoc", LocalDate.ofEpochDay(2005 - 07 - 06));
        javaContactService.createContact("Dunja", "Mirova", LocalDate.ofEpochDay(1885-07-06));
        javaContactService.createContact("Вак", "Xprior", LocalDate.ofEpochDay(2020-07-06));

        System.out.println(contactDao.toString());
        System.out.println("___________________________________________________");


        System.out.println("Contacts : "+contactDao.countContact());
        javaContactService.addHobby("I like sea", "Swing");
        System.out.println(javaContactService.getHobbyDaoImpl());

        javaContactService.addPlace("Little city","Nikoppol",65.568156, 45.4984 );

        System.out.println("___________________________________________________");
        contactDao.deleteContact((Contact) context.getBean("Contact3"));
        System.out.println(javaContactService.toString());
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");

        javaContactService.addFriendShip(contact5, contact4);
        javaContactService.addFriendShip(contact5, contact3);
        javaContactService.addFriendShip(contact5, contact2);
        javaContactService.addFriendShip(contact5, contact1);

        javaContactService.addFriendShip(contact2, contact3);
        javaContactService.addFriendShip(contact4, contact2);
        javaContactService.addFriendShip(contact2, contact1);

        System.out.println("________________________________________________________");

        Set<Contact> contactSet = contact5.getFriends();
        if (contactSet == null){
            System.out.println("Not list contacts");
        }else {
            for (Contact contact : contactSet) {
                System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getBirthDate());
            }
        }
        System.out.println("________________________________________________________");
        System.out.println(contact1.getIdContact());
        System.out.println(contact5.getIdContact());
        System.out.println("________________________________________________________");
        contactSet = javaContactService.getFriendList(contact3);
        if (contactSet == null){
            System.out.println("Not list contacts");
        }else {
            for (Contact contact : contactSet) {
                System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getBirthDate());
            }
        }
        System.out.println("________________________________________________________");

        System.out.println("Id"+contact5.getIdContact());
        javaContactService.createContact("Dgra", "Figoc", LocalDate.ofEpochDay(2012 - 07 - 06));
        javaContactService.createContact("rbtt2bnja", "Mirova", LocalDate.ofEpochDay(1915-07-06));
        javaContactService.createContact("Вtrbt35ак", "Xprior", LocalDate.ofEpochDay(2015-07-06));
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");
        contactDao.deleteContact((Contact) context.getBean("Contact2"));
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");
        contactDao.deleteContact((Contact) context.getBean("Contact4"));
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");
        contactDao.deleteContact((Contact) context.getBean("Contact1"));
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");
        contactDao.deleteContact((Contact) context.getBean("Contact5"));
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");
        contactDao.deleteContact((Contact) context.getBean("Contact5"));
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");
        javaContactService.createContact("Dgt2hra", "Figoc", LocalDate.ofEpochDay(2012 - 07 - 06));
        javaContactService.createContact("rbtttn2h2q2bnja", "Mirova", LocalDate.ofEpochDay(1915-07-06));
        System.out.println("Id"+contact5.getIdContact());

//        Hobby hobby = (Hobby) context.getBean("HobbyFishing");
//        for (Contact contact : hobbyDao.getAiiContactsWithHobby(hobby)){
//            System.out.println(contact.toString());
//        }

    }
}
