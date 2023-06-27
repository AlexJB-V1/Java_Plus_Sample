import org.example.Person;
import org.example.PersonService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonServiceTest {

    PersonService personService = new PersonService();

    @Test
    public void createPersonTest() {

        List<Person> personList = personService.createPersonList(1);

        assertEquals(1, personList.size());

    }

    @Test
    public void createPersonTest2() {

        List<Person> personList = personService.createPersonList(2);

        assertEquals(2, personList.size());

    }

    @Test
    public void createPersonTest99() {

        assertThrows(IllegalArgumentException.class, () -> personService.createPersonList(99));
        
    }

}
