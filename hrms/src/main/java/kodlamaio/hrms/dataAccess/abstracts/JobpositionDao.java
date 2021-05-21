package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Jobposition;

public interface JobpositionDao extends JpaRepository<Jobposition, Integer> {  // veri erişim nesnesi üretiyor. hibernate gibi
	
}
