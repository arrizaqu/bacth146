package com.training.xsis.dao;

import java.util.List;

import com.training.xsis.model.Items;

public interface ItemsDao {

	void save(Items item);

	List<Items> getAll();

	void updateStock(String idItemUpdate, int newStock);

}
