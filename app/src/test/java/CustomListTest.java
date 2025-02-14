import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.CustomList;
import com.example.simpleparadox.listycity.City;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    void hasCityTest() {
        createList();

        City cityTest = new City("Charlottetown", "PEI");
        assertFalse(list.hasCity(cityTest));

        list.add(cityTest);
        assertTrue(list.hasCity(cityTest));
    }
}


