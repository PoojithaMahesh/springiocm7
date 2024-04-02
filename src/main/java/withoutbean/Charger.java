package withoutbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Component;
@Component
public class Charger {
//charger
//	Mobile =mobile
//	MobileController=mobileController
	@Value("1")
	private int id;
	@Value("Ctype")
	private String name;
	@Override
	public String toString() {
		return "Charger [id=" + id + ", name=" + name + "]";
	}
	
}
