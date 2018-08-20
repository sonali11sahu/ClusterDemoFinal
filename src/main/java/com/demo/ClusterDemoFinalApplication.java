package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class ClusterDemoFinalApplication {

	private static final Logger log = LoggerFactory.getLogger(ClusterDemoFinalApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ClusterDemoFinalApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner demo(ClusterRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Cluster("Amazon", 850));
			repository.save(new Cluster("Michigan", 904));
			repository.save(new Cluster("Rhino", 1208));
			repository.save(new Cluster("Tahoe", 150));

			// fetch all customers
			log.info("Cluster found with findAll():");
			log.info("-------------------------------");
			for (Cluster cluster : repository.findAll()) {
				log.info(cluster.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			repository.findById(3L)
				.ifPresent(customer -> {
					log.info("Cluster found with findById(3L):");
					log.info("--------------------------------");
					log.info(customer.toString());
					log.info("");
				});

			// fetch customers by last name
			log.info("Cluster found with findByName('Amazon'):");
			log.info("--------------------------------------------");
			repository.findByName("Amazon").forEach(Amazon -> {
				log.info(Amazon.toString());
			});
			// for (Cluster Amazon : repository.findByName("Amazon")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}*/
	
}
