package com.demo.dao.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cluster {
	 	
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cluster_id_seq")
	    @SequenceGenerator(name="cluster_id_seq", sequenceName = "CLUSTER_ID_SEQ", allocationSize = 100)
	   // @GeneratedValue(strategy=GenerationType.AUTO)
	   	private Long id;
	    private String name;
	    private int number;

	    public Cluster() {}

	    public Cluster(String name, int number) {
	        this.name = name;
	        this.number = number;
	    }

	    @Override
	    public String toString() {
	        return String.format(
	                "Cluster[id=%d, name='%s', number='%d']",
	                id, name, number);
	    }
	    
	    public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getNumber() {
			return number;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setNumber(int number) {
			this.number = number;
		}
		
}
