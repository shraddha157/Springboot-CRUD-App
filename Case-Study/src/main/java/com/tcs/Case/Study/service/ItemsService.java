package com.tcs.Case.Study.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.Case.Study.dbo.ItemRepository;
import com.tcs.Case.Study.entity.Items;



@Service
public class ItemsService { 
	
@Autowired
private ItemRepository itemRepository;


public Items createitem(Items item) {
	return itemRepository.save(item);
}

public List<Items> createitems(List<Items> items) {
	return itemRepository.saveAll(items);
}

public Items getItemById(long id) {
	Optional<Items> oi = this.itemRepository.findById(id);
	if(oi.isPresent())
	return this.itemRepository.findById(id).orElse(null);
	else
		return new Items();
	
}

public List<Items> getItems() {
	return itemRepository.findAll();
}

public Items updateItem(Items item)
{
	Items olditem=null;
	Optional<Items> optionalitem = this.itemRepository.findById(item.getId());
	if(optionalitem.isPresent())
	{
		olditem=optionalitem.get();
		olditem.setCategory(item.getCategory());
		olditem.setCost(item.getCost());
		 itemRepository.save(olditem);
	}
	else
	{
		return new Items();
	}
	return olditem;
}

public String deleteItemById(long id) {
	Optional<Items> oid = this.itemRepository.findById(id);
	if(oid.isPresent())
	{
	 this.itemRepository.deleteById(id);
	 return "Item got deleted";
	}
	else
		return "Item not found";
}




}
