package com.tcs.Case.Study.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Case.Study.entity.Items;
import com.tcs.Case.Study.service.ItemsService;
/*
resticontroller= @controller + @responsebody, restcontroller is responsible for handling all the incoming client req
and sent it to appropriate service method depending on the url pattern
*/
 @RestController
public class ItemController {
	

@Autowired
private ItemsService itemService;

//w
@PostMapping("/additem")
public Items addItem(@RequestBody Items item)
{
	return this.itemService.createitem(item);
	
}

//w
@PostMapping("/additems")
public ResponseEntity<List<Items>> addItems(@RequestBody List<Items> items) {
	try
	{
		List<Items> a = this.itemService.createitems(items);
		return ResponseEntity.of(Optional.of(a));
	}
	catch(HttpMessageNotReadableException e)
	{
		System.out.println("invalid input");
		return ResponseEntity.status(500).build();
	}
}

//w
@GetMapping("/item/{id}")
public ResponseEntity<Items> getItemById(@PathVariable String id) {
	try
	{
	long d=Long.parseLong(id);
	Items i= itemService.getItemById(d);
	return ResponseEntity.of(Optional.of(i));
	}
	catch(NumberFormatException e)
	{
		System.out.println("invalid input");
		return ResponseEntity.status(500).build();
	}
}

//w
@GetMapping("/items")
public List<Items> getAllitems() {
	return itemService.getItems();
}

//w
@PutMapping("/updateitem")
public Items updateItem(@RequestBody Items item) {
	return itemService.updateItem(item);
}

//w
@DeleteMapping("/deleteitem/{id}")
public ResponseEntity<String> deleteItem(@PathVariable String id) {
	try
	{
	long d=Long.parseLong(id);
	String i= itemService.deleteItemById(d);
	return ResponseEntity.of(Optional.of(i));
	}
	catch(NumberFormatException e)
	{
		System.out.println("invalid input");
		return ResponseEntity.status(500).build();
	}
}
}
