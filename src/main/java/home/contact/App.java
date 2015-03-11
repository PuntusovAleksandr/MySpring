package home.contact;

import home.contact.ContactService.impl.JavaContactService;
import home.contact.CoreMyCpring.Contact;
import home.contact.MyFilesDOT.inpl.ContactDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Aleksandr on 08.03.2015.
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myJavaContact.xml");
        JavaContactService javaContactService = (JavaContactService) context.getBean("JavaContact");

        ContactDao contactDao = (ContactDao) context.getBean("ContactDao");
//        HobbyDao hobbyDao = (HobbyDao) context.getBean("HobbyDao");
//        PlaceDao placeDao = (PlaceDao) context.getBean("PlaceDao");
//        MessageDao messageDao = (MessageDao) context.getBean("MessegeDao");
        System.out.println(contactDao.toString());
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");
        contactDao.deleteContact((Contact) context.getBean("Contact3"));
        System.out.println(contactDao.toString());
        System.out.println("Contacts : "+contactDao.countContact());
        System.out.println("___________________________________________________");

    }
}
