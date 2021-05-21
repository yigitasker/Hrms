package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobpositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobpositionDao;
import kodlamaio.hrms.entities.concretes.Jobposition;


@Service
public class JobpositionManager implements JobpositionService {

	
	private JobpositionDao jobpositionDao;
	
	@Autowired
	public JobpositionManager(JobpositionDao jobpositionDao) {
		super();
		this.jobpositionDao = jobpositionDao;
	}


	@Override
	public List<Jobposition> getAll() {
		
		return this.jobpositionDao.findAll();
	}

}
