package playground.jbpm;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import playground.jbpm.category.IntegrationTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/application.xml")
@Category(IntegrationTest.class)
public class SmokeTest {
	
	@Test
	public void Config_OK() {
	}

}
