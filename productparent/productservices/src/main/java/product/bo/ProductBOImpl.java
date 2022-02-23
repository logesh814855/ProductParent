package product.bo;

import product.dao.ProductDAO;
import product.dao.ProductDAOImpl;
import product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
