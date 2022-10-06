package com.pattern.AbstractFactory;

import com.pattern.AbstractFactory.Instance.Capacity;

public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		// TODO Auto-generated method stub
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		// TODO Auto-generated method stub
		return new GoogleCloudStorage(capMib);
	}

}
