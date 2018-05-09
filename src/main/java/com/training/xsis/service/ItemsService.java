package com.training.xsis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.xsis.dao.ItemsDao;
import com.training.xsis.dao.ItemsStockDao;
import com.training.xsis.model.ItemStock;
import com.training.xsis.model.Items;

@Transactional
@Service
public class ItemsService {

	@Autowired
	ItemsDao itemsDao;
	
	@Autowired
	ItemsStockDao itemsStockDao;
	
	public void save(Items item) {
		// TODO Auto-generated method stub
		itemsDao.save(item);
	}
	
	public List<Items> getAll() {
		// TODO Auto-generated method stub
		List<Items> items = itemsDao.getAll();
		
		if(!items.isEmpty()) {
			for(Items item : items) {
				List<ItemStock> itemsStok = itemsStockDao.getItemsStokByItem(item);
				item.setItemStock(itemsStok);
			}
		}
		
		return items;
	}

}
