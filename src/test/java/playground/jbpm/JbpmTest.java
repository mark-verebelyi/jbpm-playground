package playground.jbpm;

import org.drools.runtime.StatefulKnowledgeSession;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import playground.jbpm.category.IntegrationTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/application.xml")
@Category(IntegrationTest.class)
public class JbpmTest {

	@Autowired
	private StatefulKnowledgeSession ksession;

	@Test
	public void Hello_World_Process() {
		this.ksession.startProcess("com.sample.bpmn");
	}

}
