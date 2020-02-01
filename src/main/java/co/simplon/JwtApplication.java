package co.simplon;

import co.simplon.dao.TaskRepository;
import co.simplon.entity.AppRole;
import co.simplon.entity.AppUser;
import co.simplon.entity.Task;
import co.simplon.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtApplication implements CommandLineRunner {
	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private AccountService accountService;

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountService.saveUser(new AppUser(null,"admin","1234",null));
		accountService.saveUser(new AppUser(null,"user","1234",null));
		accountService.saveRole(new AppRole(null,"ADMIN"));
		accountService.saveRole(new AppRole(null,"USER"));
		accountService.addRoleToUse("admin","ADMIN");
		accountService.addRoleToUse("user","USER");
		taskRepository.save(new Task(null,"first"));
		taskRepository.save(new Task(null,"second"));
		taskRepository.save(new Task(null,"third"));
		taskRepository.save(new Task(null,"fourth"));
		taskRepository.findAll().forEach(task->{
			System.out.println(task);
		});
	}
}
