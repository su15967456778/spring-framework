package slf.populateBean.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author sulingfeng
 * @title: PersonController
 * @projectName spring
 * @description: TODO
 * @date 2021/9/9 15:00
 */
@Controller
public class PersonController {

	@Autowired
	private PersonService personService;
}
