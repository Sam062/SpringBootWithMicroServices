package base;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootApplicationRuunerApplication implements ApplicationRunner,CommandLineRunner {
	
	@Bean
	public ApplicationRunner appRun() {
		return args->{System.out.println("LAMBDA EXPN APP RUN");};
	}
	@Bean
	public CommandLineRunner cmdRun() {
		return args->{System.out.println("LAMBDA EXPN CMDLINE RUN");};
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("--- App Runner From SPRBOOT APP ---");

	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("--- CommandLine Runner From SPRBOOT APP ---");

	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationRuunerApplication.class, args);
	}

}
