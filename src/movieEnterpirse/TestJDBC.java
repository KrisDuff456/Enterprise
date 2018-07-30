
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestJDBC {

	@Test
	public void testConncetion(){
	    new JDBC();
		assertNotNull("conncetion not found",JDBC.conn);
	}
	
}
