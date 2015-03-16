package home.contact.dao.inpl;

import home.contact.dao.InterfacePlaceDao;
import home.contact.model.Place;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PlaceDaoTest {

    @Mock
    private InterfacePlaceDao interfacePlaceDao;
    @InjectMocks
    private PlaceDao placeDao = new PlaceDao();

    @Test
    public void testAddPlace() throws Exception {

    }

    @Test
    public void testGetAllContactsPlace() throws Exception {
        when(interfacePlaceDao.getAllContactsPlace((Place) anyObject())).thenReturn(Collections.EMPTY_SET);
    }
}