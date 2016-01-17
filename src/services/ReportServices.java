package services;

import java.util.ArrayList;
import java.util.List;

import products.FullHDMonitor;
import products.Laptop;
import products.Monitor;
import products.UHDMonitor;

/**
 * Abstract report service class.
 */
public abstract class ReportServices {

	// Injected using DI (e.g. spring)
	private ProductService productService;

	public abstract String generateUniqueProductReport(List products);

	/**
	 * Returns true if product with such id already exists in list
	 *
	 * @param productId
	 * @param uniqueProducts
	 * @return
	 */

	public boolean contains(int productId, ArrayList uniqueProducts) {
		for (int i = 0; i < uniqueProducts.size(); i++) {
			Object product = uniqueProducts.get(i);
			if (product == FullHDMonitor.class) {
				int id = ((FullHDMonitor) product).getId();
				if (id == productId) {
					return true;
				}
			}
			if (product == Laptop.class) {
				int id = ((Laptop) product).getId();
				if (id == productId) {
					return true;
				}
			}
			if (product == UHDMonitor.class) {
				int id = ((UHDMonitor) product).getId();
				if (id == productId) {
					return true;
				}
			}
			if (product == Monitor.class) {
				int id = ((Monitor) product).getId();
				if (id == productId) {
					return true;
				}
			}
		}
		return false;
	}

}
