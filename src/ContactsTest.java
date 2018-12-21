import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ContactsTest {
	static Contacts contacts = new Contacts();
	
	@BeforeAll
	static void initAll() {
		contacts.CreateContacts("John", "010-0000-0000", "John@sookmyung.ac.kr");
	}
	
	@AfterAll
	static void tearDownAll() {
		
	}
	
	@BeforeEach
	void init() {
		
	}
	
	@AfterEach
	void tearDown() {
	
	}
	
	@Test
	void testContactSize() {
		assertFalse (contacts.isContactSizeZero(contacts.size));
	}
	
	@Test
	void testNumberOfData() {
		assertTrue (contacts.isThereOneData());
		contacts.CreateContacts("Jane", "010-1111-1111", "Jane@sookmyung.ac.kr");
		assertFalse (contacts.isThereOneData());
	}
}
