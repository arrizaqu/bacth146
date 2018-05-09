package com.training.xsis.dao;

import java.util.List;

import com.training.xsis.model.ItemStock;
import com.training.xsis.model.Items;

public interface ItemsStockDao {

	List<ItemStock> getItemsStokByItem(Items item);

	void updateStatusBayar(String string);

	List<ItemStock> getItemsStokByItemQTY(Items item, int stock);

}
