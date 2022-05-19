package amazonapp.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amazonapp.bean.Product;
import amazonapp.repositary.MyLocalRepository;
import amazonapp.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {

	// injected the depedency MyLocalRepository into service class
	@Autowired
	MyLocalRepository myLocalRepository;

	public Product addProduct(Product product) {

		Product addprodcut = myLocalRepository.save(product);

		return addprodcut;  // returning to controler
	}

}
