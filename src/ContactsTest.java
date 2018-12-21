import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ContactsTest {
	
	@BeforeAll
	static void initAll() {
		
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
	void test() {
		Contacts contacts = new Contacts();
		assertTrue (contacts.isContactSizeZero(0));
		assertFalse (contacts.isThereNoData("testname"));
	}
}
