package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobpositionService;
import kodlamaio.hrms.entities.concretes.Jobposition;

@RestController
@RequestMapping("/api/jobposition")
public class JobpositionController {
	
	
	private JobpositionService jobpositionService;
	
	@Autowired
	public JobpositionController(JobpositionService jobpositionService) {
		super();
		this.jobpositionService = jobpositionService;
	}



	@GetMapping("/getall")
	public List<Jobposition> getAll(){
		return this.jobpositionService.getAll();
	}
}
