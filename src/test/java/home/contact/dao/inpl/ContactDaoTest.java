package home.contact.dao.inpl;

import home.contact.dao.InterfaceContactDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class ContactDaoTest {
    @Mock
    private InterfaceContactDao interfaceContactDao;
    @InjectMocks
    private ContactDao contactDao = new ContactDao();

    @Test
    public void testAddContact() throws Exception {

    }

    @Test
    public void testDeleteContact() throws Exception {

    }

    @Test
    public void testAddFriendShip() throws Exception {

    }

    @Test
    public void testRemoveFriendship() throws Exception {

    }

    @Test
    public void testCountContact() throws Exception {
        when(interfaceContactDao.countContact()).thenReturn(1);
    }

}