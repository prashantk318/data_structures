package com.pattern.AbstractFactory;

import com.pattern.AbstractFactory.Instance.Capacity;

public class Client {
	
	public static void main(String[] args) {
		Client client = new Client(new GoogleResourceFactory());
		Instance instance = client.createServer(Capacity.large, 20480);
		instance.start();
		instance.stop();
	}
private ResourceFactory factory;
	
	public Client(ResourceFactory factory) {
		this.factory = factory;
	}
	public Instance createServer(Instance.Capacity cap, int storageMib) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}
	

}
