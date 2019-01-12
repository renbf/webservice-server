package com.yl.webservice.impl;

import java.util.List;

import javax.jws.WebService;

import com.yl.model.Order;
import com.yl.webservice.IRemoteService;

@WebService(endpointInterface="com.yl.webservice.IRemoteService")
public class RemoteServiceImpl implements IRemoteService {

	@Override
	public String showRemoteMessage(String message) {
		return "You message is "+ message;
	}

	@Override
	public String addOrder(List<Order> orders) {
		return "orders";
	}


}
