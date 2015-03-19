package home.contact;

import home.contact.service.impl.JavaContactService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Aleksandr on 08.03.2015.
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myJavaContact.xml");
        JavaContactService javaContactService = (JavaContactService) context.getBean("JavaContact");

//        ContactDaoImpl contactDao = (ContactDaoImpl) context.getBean("ContactDaoImpl");
//        HobbyDaoImpl hobbyDao = (HobbyDaoImpl) context.getBean("HobbyDaoImpl");
//        PlaceDaoImpl placeDao = (PlaceDaoImpl) context.getBean("PlaceDaoImpl");
//        MessageDaoImpl messageDao = (MessageDaoImpl) context.getBean("MessageDaoImpl");
//
//
//
//        System.out.println(contactDao.toString());
//        System.out.println("Contacts : "+contactDao.countContact());
//        System.out.println("___________________________________________________");
//        contactDao.deleteContact((Contact) context.getBean("Contact3"));
//        System.out.println(contactDao.toString());
//        System.out.println("Contacts : "+contactDao.countContact());
//        System.out.println("___________________________________________________");
//
//        Contact contact1 = (Contact) context.getBean("Contact1");
//        Contact contact2 = (Contact) context.getBean("Contact2");
//        Contact contact3 = (Contact) context.getBean("Contact3");
//        Contact contact4 = (Contact) context.getBean("Contact4");
//        Contact contact5 =(Contact) context.getBean("Contact5");
//
//        Place dnepr = (Place) context.getBean("PlaceDnepr");
//        Place kiev = (Place) context.getBean("PlaceKiev");
//        Place odessa = (Place) context.getBean("PlaceOdessa");
//
//        javaContactService.createContact("Monja", "Figoc", LocalDate.ofEpochDay(2005-07-06));
//        javaContactService.createContact("Dunja", "Mirova", LocalDate.ofEpochDay(1885-07-06));
//        javaContactService.createContact("Вак", "Xprior", LocalDate.ofEpochDay(2020-07-06));
//
//        System.out.println("Contacts : "+contactDao.countContact());
//        javaContactService.addHobby("I like see", "Swing");
//        System.out.println();
//
//        javaContactService.addPlace("Little city","Nikoppol",65.568156, 45.4984 );
//
//        System.out.println("___________________________________________________");
//        contactDao.deleteContact((Contact) context.getBean("Contact3"));
//        System.out.println(contactDao.toString());
//        System.out.println("Contacts : "+contactDao.countContact());
//        System.out.println("___________________________________________________");
//
//        javaContactService.addFriendShip(contact5, contact4);
//        javaContactService.addFriendShip(contact5, contact3);
//        javaContactService.addFriendShip(contact5, contact2);
//        javaContactService.addFriendShip(contact5, contact1);
//
//        javaContactService.addFriendShip(contact2, contact3);
//        javaContactService.addFriendShip(contact4, contact2);
//        javaContactService.addFriendShip(contact2, contact1);
//
//        System.out.println(contactDao.toString());
//        System.out.println("________________________________________________________");
//
//        Set<Contact> contactSet = javaContactService.getFriendList(contact1);
//        if (contactSet == null){
//            System.out.println("Not list contacts");
//        }else {
//            for (Contact contact : contactSet) {
//                System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getBirthDate());
//            }
//        }
//        System.out.println("________________________________________________________");
//        System.out.println(contact1.getIdContact());
//        System.out.println(contact5.getIdContact());
//        System.out.println("________________________________________________________");
//        contactSet = javaContactService.getFriendList(contact5);
//        if (contactSet == null){
//            System.out.println("Not list contacts");
//        }else {
//            for (Contact contact : contactSet) {
//                System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getBirthDate());
//            }
//        }
//        System.out.println("________________________________________________________");

    }
}
