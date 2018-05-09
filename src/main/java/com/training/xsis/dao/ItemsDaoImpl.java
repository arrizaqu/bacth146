package com.training.xsis.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.xsis.model.Items;

@Repository
public class ItemsDaoImpl implements ItemsDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(Items item) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(item);
	}
	@Override
	public List<Items> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
	    String hql = "from Items it where it.stock != 0";
	    List<Items> listItems = session.createQuery(hql).list();
	    if(listItems.isEmpty()) {
	    	return new ArrayList<>();
	    }
	    
	    return listItems;
		//return session.createCriteria(Items.class).list();
	}
	
	@Override
	public void updateStock(String idItemUpdate, int newStock) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "update Items it set it.stock =:newStock where it.id =:id";
		Query query = session.createQuery(hql);
		query.setParameter("newStock", newStock);
		query.setParameter("id", idItemUpdate);
		query.executeUpdate();
	}

}
