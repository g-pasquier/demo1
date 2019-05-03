package com.starter.demo.order;

import java.util.List;

public interface OrderService<T> {

	Order<?> add(List<?> items);

}
