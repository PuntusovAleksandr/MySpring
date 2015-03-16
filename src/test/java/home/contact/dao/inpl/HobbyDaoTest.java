package home.contact.dao.inpl;

import home.contact.dao.InterfaceHobbyDao;
import home.contact.model.Hobby;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class HobbyDaoTest {

    @Mock
    private InterfaceHobbyDao interfaceHobbyDao;
    @InjectMocks
    private HobbyDao hobbyDao = new HobbyDao();

    @Test
    public void testAddHobby() throws Exception {

    }

    @Test
    public void testGetAiiContactsWithHobby() throws Exception {
        when(interfaceHobbyDao.getAiiContactsWithHobby((Hobby) anyObject())).thenReturn(Collections.EMPTY_SET);

    }

}