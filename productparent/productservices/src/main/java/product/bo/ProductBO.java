package product.bo;

import product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	
	Product findProduct(int id);

}
