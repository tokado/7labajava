package controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Delfin;

@RequestMapping("/delfins")
@RestController

public class DelfinControler {
	private Map<Integer, Delfin> delfins = new HashMap<>();
	  private AtomicInteger idAccount = new AtomicInteger();

	  @GetMapping
	  public List<Delfin> getAllDelfins() {
	    return new LinkedList<Delfin>(delfins.values());
	  }

	  @GetMapping(path = "/{id}")
	  public Delfin getLion(@PathVariable("id") Integer delfinId) {
	    System.out.println(delfinId);
	    return delfins.get(delfinId);
	  }

	  @PostMapping
	  public Delfin createDress(final @RequestBody Delfin delfin) {
		delfin.setId(idAccount.incrementAndGet());
		delfins.put(delfin.getId(), delfin);
	    return delfin;
	  }

	  @DeleteMapping(path = "/{id}")
	  public ResponseEntity<Delfin> deleteLion(@PathVariable("id") Integer delfinId) {
	   HttpStatus status = delfins.remove(delfinId)==null?HttpStatus.NOT_FOUND:HttpStatus.OK;
	   return ResponseEntity.status(status).build();
	 
	  }
	  @PutMapping(path= "/{id}")
	  public Delfin updateLion(final @PathVariable ("id") Integer delfinId, 
	      final @RequestBody Delfin delfin) {
	    delfin.setId(delfinId);
	    return delfins.put(delfinId, delfin);
	  }
	  }


