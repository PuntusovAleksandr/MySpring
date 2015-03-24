package home.contact;

import home.contact.dao.inpl.ContactDaoImpl;
import home.contact.model.Contact;
import home.contact.model.Place;
import home.contact.service.ContactService;
import home.contact.service.impl.JavaContactService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 08.03.2015.
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myJavaContact.xml");
        ContactService javaContactService = context.getBean(JavaContactService.class);
        ContactDaoImpl contactDao = context.getBean(ContactDaoImpl.class);
        Contact contact = context.getBean(Contact.class);

        System.out.println(javaContactService.toString());
        System.out.println("___________________________________________________");

        Contact contact1 = context.getBean(Contact.class);
        Contact contact2 = context.getBean(Contact.class);
        Contact contact3 = context.getBean(Contact.class);
        Contact contact4 = context.getBean(Contact.class);
        Contact contact5 = context.getBean(Contact.class);

        javaContactService.addContact(contact1);
        javaContactService.addContact(contact2);
        javaContactService.addContact(contact3);
        javaContactService.addContact(contact4);
        javaContactService.addContact(contact5);

        int count = contactDao.countContact();
        if (count !=0 ){
            System.out.println("Contacts : "+contactDao.countContact());
        }else System.out.println("Contacts no !");
        System.out.println();

        System.out.println("___________________________________________________");

        javaContactService.createContact("1","1.1");
        javaContactService.createContact("2","1.1");
        javaContactService.createContact("3","1.1");
        javaContactService.createContact("4","1.1");

        List<Contact> listAllContacts = javaContactService.getAllContact();
        for (Contact a : listAllContacts){
            System.out.println(a.toString());
        }

        System.out.println("Id"+contact5.getIdContact());
        System.out.println("___________________________________________________");

        Place dnepr = context.getBean(Place.class);
        Place kiev = context.getBean(Place.class);
        Place odessa = context.getBean(Place.class);

        javaContactService.addPlace(dnepr);
        javaContactService.addPlace(kiev);
        javaContactService.addPlace(odessa);

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

        javaContactService.deleteContact(contact4);
        System.out.println(javaContactService.toString());
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");

        javaContactService.addFriendShip(contact5, contact1);
        javaContactService.addFriendShip(contact5, contact3);
        javaContactService.addFriendShip(contact5, contact2);
        javaContactService.addFriendShip(contact5, contact1);

        javaContactService.addFriendShip(contact2, contact3);
        javaContactService.addFriendShip(contact1, contact2);
        javaContactService.addFriendShip(contact2, contact1);

        System.out.println("________________________________________________________");

        Set<Contact> contactSet = javaContactService.getFriendList(contact5);
        showFriendShip(contactSet);
        contactSet = javaContactService.getFriendList(contact2);
        showFriendShip(contactSet);
        contactSet = javaContactService.getFriendList(contact3);
        showFriendShip(contactSet);

        System.out.println("________________________________________________________");
        System.out.println(contact1.getIdContact());
        System.out.println(contact2.getIdContact());
        System.out.println(contact3.getIdContact());
        System.out.println(contact4.getIdContact());
        System.out.println(contact5.getIdContact());
        System.out.println("________________________________________________________");
        System.out.println(javaContactService.getIdContact(contact1));
        System.out.println("________________________________________________________");

        System.out.println("________________________________________________________");

        System.out.println("Id"+contact5.getIdContact());
        javaContactService.createContact("Dgra", "Figoc", LocalDate.ofEpochDay(2012 - 07 - 06));
        javaContactService.createContact("rbtt2bnja", "Mirova", LocalDate.ofEpochDay(1915-07-06));
        javaContactService.createContact("Вtrbt35ак", "Xprior", LocalDate.ofEpochDay(2015-07-06));
        System.out.println("Contacts : " + contactDao.countContact());
        System.out.println("___________________________________________________");
        javaContactService.deleteContact(contact2);
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");
        System.out.println("___________________________________________________");
        javaContactService.createContact("Dgt2hra", "Figoc", LocalDate.ofEpochDay(2012 - 07 - 06));
        javaContactService.createContact("rbtttn2h2q2bnja", "Mirova", LocalDate.ofEpochDay(1915-07-06));

//        Contact contact6 = context.getBean(Contact.class);
//        javaContactService.addContact(contact6);
        System.out.println("Id"+contact.getIdContact());

//        Hobby hobby = (Hobby) context.getBean("HobbyFishing");
//        for (Contact contact : hobbyDao.getAiiContactsWithHobby(hobby)){
//            System.out.println(contact.toString());
//        }

    }

    private static void showFriendShip(Set<Contact> contactSet) {
        if (contactSet == null){
            System.out.println("Not list contacts");
        }else {
            for (Contact contact : contactSet) {
                System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getBirthDate());
            }
        }
    }


}
