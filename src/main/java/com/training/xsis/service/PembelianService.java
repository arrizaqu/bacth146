package com.training.xsis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.xsis.dao.DetailPembelianDao;
import com.training.xsis.dao.ItemsDao;
import com.training.xsis.dao.ItemsStockDao;
import com.training.xsis.dao.PembelianDao;
import com.training.xsis.model.DetailPembelian;
import com.training.xsis.model.ItemStock;
import com.training.xsis.model.Items;
import com.training.xsis.model.Pembelian;

@Transactional
@Service
public class PembelianService {
	
	@Autowired
	PembelianDao pembelianDao;
	@Autowired
	DetailPembelianDao detailPembelianDao;
	@Autowired
	ItemsDao itemsDao;
	@Autowired
	ItemsStockDao itemsStockDao;

	public void bayar(Pembelian pembelian) {
		// TODO Auto-generated method stub
		/*
		 * 2. save data pembelian
				3. save data detail pembelian untuk item yang di beli
				4. update stok di item
				5. ubah status item dari 0 ke 1 (terjual) untuk setiap item
		 * */
		//save pembelian
		Pembelian pem = new Pembelian();
		pem.setQuantityItems(pembelian.getQuantityItems());
		pem.setTotalPrice(pembelian.getTotalPrice());
		pem.setCustomer(pembelian.getCustomer());
		pembelianDao.save(pem);
		for(DetailPembelian dp : pembelian.getDetailPembelian()) {
			DetailPembelian dPem = new DetailPembelian();
			dPem.setItems(dp.getItems());
			dPem.setTotalQty(dp.getTotalQty());
			dPem.setPembelian(pem);
			detailPembelianDao.save(dPem);
			
			//update data stok di item
			Items item = new Items();
			item.setId(dp.getItems().getId());
			item.setStock(dp.getItems().getStock());
			
			System.out.println("stock : " + item.getStock());
			System.out.println("qty : "+ dp.getTotalQty());
			
			int newStock = item.getStock() - dp.getTotalQty();
			
			itemsDao.updateStock(item.getId(), newStock);
			
			
			//ambil data itemStock
			List<ItemStock> listItemsStock = itemsStockDao.getItemsStokByItemQTY(item, item.getStock());
			if(!listItemsStock.isEmpty()) {
				for(ItemStock ist : listItemsStock) {
					itemsStockDao.updateStatusBayar(ist.getId());
				}
			}
		}
		
		
		
	}

	
}
