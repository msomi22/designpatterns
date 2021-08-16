/**
 * 
 */
package com.example.demoBoot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/**
 * 
 *
 */
@Component
public class LifeCycleHooks {

	@PostConstruct
	public void init() {
      System.out.println("Init life sycle");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy life sycle");
	}

}
