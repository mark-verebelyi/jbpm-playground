package playground.jbpm.workitemhandler;

import org.drools.runtime.process.WorkItem;
import org.drools.runtime.process.WorkItemHandler;
import org.drools.runtime.process.WorkItemManager;
import org.springframework.beans.factory.annotation.Required;

import playground.jbpm.HelloService;

public class NotificationWorkItemHandler implements WorkItemHandler {

	private HelloService helloService;

	@Required
	public void setHelloService(final HelloService helloService) {
		this.helloService = helloService;
	}

	@Override
	public void executeWorkItem(final WorkItem workItem, final WorkItemManager manager) {
		this.helloService.sayHello();
	}

	@Override
	public void abortWorkItem(final WorkItem workItem, final WorkItemManager manager) {
		this.helloService.sayGoodbye();
	}

}
