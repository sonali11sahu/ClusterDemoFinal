package com.demo.dao.bean;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.demo.model.impl.ClusterRepository;

@Component
public class ClusterLoader implements ApplicationListener<ContextRefreshedEvent> {

	private ClusterRepository clusterRepository;

	private Logger log = LoggerFactory.getLogger(ClusterLoader.class);

	@Autowired
	public void setProductRepository(ClusterRepository productRepository) {
		this.clusterRepository = productRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		Cluster amazon = new Cluster();
		amazon.setName("Amazon");
		amazon.setNumber(850);
		clusterRepository.save(amazon);

		log.info("Saved Cluster - id: " + amazon.getId());

		
		Cluster Michigan = new Cluster();
		Michigan.setName("Michigan");
		Michigan.setNumber(904);
		clusterRepository.save(Michigan);

		log.info("Saved Cluster - id: " + Michigan.getId());
		
		Cluster Rhino = new Cluster();
		Rhino.setName("Rhino");
		Rhino.setNumber(1208);
		clusterRepository.save(Rhino);

		log.info("Saved Cluster - id: " + Rhino.getId());
		
		Cluster Tahoe = new Cluster();
		Tahoe.setName("Tahoe");
		Tahoe.setNumber(150);
		clusterRepository.save(Tahoe);

		log.info("Saved Cluster - id: " + Tahoe.getId());
		
	}
}