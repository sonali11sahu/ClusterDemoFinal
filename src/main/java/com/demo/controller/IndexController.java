package com.demo.controller;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.dao.bean.Cluster;
import com.demo.dao.bean.ClusterJsonResponse;
import com.demo.services.ClusterService;

@Controller
public class IndexController {
	
	private ClusterService clusterService;

	
	/*@Bean
	public AuthenticationSuccessHandler successHandler() {
	    SimpleUrlAuthenticationSuccessHandler handler = new SimpleUrlAuthenticationSuccessHandler();
	    handler.setUseReferer(true);
	    return handler;
	}*/
	
    @Autowired
    public void setClusterService(ClusterService clusterService) {
        this.clusterService = clusterService;
    }
	
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
         return "login";
    }
	
    @RequestMapping("/login")
    public String error(){
         return "error";
    }
    
    @RequestMapping("/")
    public String list(Model model){
        model.addAttribute("clusters", clusterService.listAllClusters());
        return "index";
    }
    
    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String saveProduct(Cluster cluster){
    	clusterService.saveCluster(cluster);
    	return "redirect:/home";
    }
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("clusters", clusterService.listAllClusters());
        model.addAttribute("cls", new Cluster());
        return "admin";
    }
  
    //TODO
    
   /* @PostMapping(value = "/updateCluster", produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public ClusterJsonResponse saveEmployee(@ModelAttribute Cluster cluster,
          BindingResult result) {
    	
    	
    	ClusterJsonResponse respone = new ClusterJsonResponse();
       
       if(result.hasErrors()){
          
          //Get error message
          Map<String, String> errors = result.getFieldErrors().stream()
                .collect(
                      Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage)
                  );
          
          respone.setValidated(false);
          respone.setErrorMessages(errors);
       }else{
          // Implement business logic to save employee into database
          //..
          respone.setValidated(true);
          respone.setCluster(cluster);
       }
       return respone;
    }*/
    
}