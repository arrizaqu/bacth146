package com.training.xsis.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.xsis.model.ItemStock;
import com.training.xsis.model.Items;

@Repository
public class ItemsStockDaoImpl implements ItemsStockDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<ItemStock> getItemsStokByItem(Items item) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from ItemStock ist where ist.items =:item";
		List<ItemStock> listStock = session.createQuery(hql).setParameter("item", item).list();
		if(listStock.isEmpty()) {
			return new ArrayList<>();
		}
		
		return listStock;
	}

	//@Override
	/*public void updateStatusBayar(Items item) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "update ItemStock ist set ist.statusItem = 1 where ist.items =:item";
		Query query = session.createQuery(hql);
		query.setParameter("item", item);
		query.executeUpdate();
	}*/

	@Override
	public List<ItemStock> getItemsStokByItemQTY(Items item, int stock) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from ItemStock ist where ist.items =:item";
		Query query = session.createQuery(hql);
		query.setParameter("item", item);
		query.setFirstResult(0);
		query.setMaxResults(stock-1);
		List<ItemStock> iStocks = query.list();
		if(iStocks.isEmpty()) {
			return new ArrayList<>();
		}
		return iStocks;
	}

	@Override
	public void updateStatusBayar(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "update ItemStock ist set ist.statusItem = 1 where ist.id =:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();
	}

}
