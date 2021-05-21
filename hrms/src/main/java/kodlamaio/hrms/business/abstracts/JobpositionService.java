package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Jobposition;

public interface JobpositionService {
	List<Jobposition> getAll();
}
