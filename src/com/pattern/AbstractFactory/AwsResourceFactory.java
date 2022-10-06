package com.pattern.AbstractFactory;

import com.pattern.AbstractFactory.Instance.Capacity;

public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		// TODO Auto-generated method stub
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		// TODO Auto-generated method stub
		return new S3Storage(capMib);
	}

}
