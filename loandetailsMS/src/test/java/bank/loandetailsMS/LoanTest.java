package bank.loandetailsMS;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import bank.loandetailsMS.controller.LoandetailsController;
import bank.loandetailsMS.repository.LoandetailsRepository;
import bank.loandetailsMS.service.LoandetailsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoanTest  {
	
	@Autowired
	private LoandetailsService service;
	
	
	@MockBean
	private LoandetailsRepository repo;
	
	
	public void getLoanByIdTest() {
		when(repo.findById(null))
	}
	
	
}