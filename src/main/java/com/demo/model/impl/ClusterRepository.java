package com.demo.model.impl;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.demo.dao.bean.Cluster;

public interface ClusterRepository extends CrudRepository<Cluster, Long>{

	//List<Cluster> findByName(String name);
	List<Cluster> findByNameOrderById(long id);
	List<Cluster> findByIdOrderById(long id);
}

