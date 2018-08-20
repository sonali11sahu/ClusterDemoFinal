package com.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.bean.Cluster;
import com.demo.model.impl.ClusterRepository;


@Service
public class ClusterServiceImpl implements ClusterService{

	private ClusterRepository clusterRepository;
	
	@Autowired
    public void setClusterRepository(ClusterRepository clusterRepository) {
        this.clusterRepository = clusterRepository;
    }
	
	@Override
	public Iterable<Cluster> listAllClusters() {
		// TODO Auto-generated method stub
		return clusterRepository.findAll();
	}

	@Override
	public Optional<Cluster> getClusterById(Long id) {
		// TODO Auto-generated method stub
		return clusterRepository.findById(id);
	}

	@Override
	public Cluster saveCluster(Cluster cluster) {
		// TODO Auto-generated method stub
		return clusterRepository.save(cluster);
	}

	@Override
	public void deleteCluster(Long id) {
		// TODO Auto-generated method stub
		clusterRepository.deleteById(id);
	}

}
