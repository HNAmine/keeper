package com.hn.keeper.starter.service;

import org.springframework.stereotype.Service;

@Service
public class KeeperService {

	private String currentTransformer;

	public String getCurrentTransformer() {
		return currentTransformer;
	}

	public void setCurrentTransformer(String currentTransformer) {
		this.currentTransformer = currentTransformer;
	}

}
