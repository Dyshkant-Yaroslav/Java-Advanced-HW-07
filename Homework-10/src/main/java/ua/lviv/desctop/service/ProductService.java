package ua.lviv.desctop.service;

import java.util.Map;

import ua.lviv.desctop.domain.Product;
import ua.lviv.desctop.shared.AbstractCRUD;

public interface ProductService extends AbstractCRUD<Product>{
	public Map<Integer, Product> readAllMap();
}
