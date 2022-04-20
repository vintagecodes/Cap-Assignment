package mongodbconnect.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersRepository ordersRepository;
	
	@PostMapping("/")
	public ResponseEntity<?> addOrder(@RequestBody Orders order){

		Orders save = this.ordersRepository.save(order);
		return ResponseEntity.ok(save);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getOrders(){

		return ResponseEntity.ok(this.ordersRepository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOrdersById(@PathVariable int id){
		
		return ResponseEntity.ok(this.ordersRepository.findById(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateOrders(@RequestBody Orders order, @PathVariable int id){
		
		order.setId(id);
		return ResponseEntity.ok(this.ordersRepository.save(order));
	}
	
	@DeleteMapping("/{id}")
	public void deleteOrders(@PathVariable int id){
		ordersRepository.deleteById(id);
		
		
	}
}
