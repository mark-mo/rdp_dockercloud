package com.gcu.service;

import com.gcu.data.IContainerDAO;
import com.gcu.model.Container;

public class ContainerService implements IContainerService {
	IContainerDAO data;

	@Override
	public boolean createContainer(Container container) {
		return data.createContainer(container);
	}

	@Override
	public Container findContainer(Container container) {
		return data.findContainer(container);
	}
	
	@Override
	public boolean updateContainer(Container container) {
		return data.updateContainer(container);
	}

	@Override
	public boolean deleteContainer(Container container) {
		return data.deleteContainer(container);
	}

}
