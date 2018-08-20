package com.demo.services;

import java.util.Optional;

import com.demo.dao.bean.Cluster;

public interface ClusterService {

	Iterable<Cluster> listAllClusters();

	Optional<Cluster> getClusterById(Long id);

	Cluster saveCluster(Cluster cluster);

    void deleteCluster(Long id);
    
}
