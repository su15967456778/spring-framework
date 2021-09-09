package slf.populateBean.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sulingfeng
 * @title: PersonService
 * @projectName spring
 * @description: TODO
 * @date 2021/9/9 15:00
 */
@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;

}
