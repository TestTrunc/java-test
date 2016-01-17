package services;

import java.util.ArrayList;
import java.util.List;

import products.FullHDMonitor;
import products.Laptop;
import products.Monitor;
import products.UHDMonitor;

/**
 * Html report service.
 */
public class HTMLReportService extends ReportServices {

	@Override
	public String generateUniqueProductReport(List products) {
		ArrayList uniqueProducts = new ArrayList();
		String report = "";
		for (int i = 0; i < products.size(); i++) {
			Object product = products.get(i);
			if (product == FullHDMonitor.class) {
				int id = ((FullHDMonitor) product).getId();
				if (!contains(id, uniqueProducts)) {
					uniqueProducts.add(product);
					report = report + "<div>"
							+ ((FullHDMonitor) product).getId() + "</div><div>"
							+ ((FullHDMonitor) product).getName()
							+ "</div><div>"
							+ ((FullHDMonitor) product).getPrice() + "</div>\n";
				}
			}
			if (product == Laptop.class) {
				int id = ((Laptop) product).getId();
				if (!contains(id, uniqueProducts)) {
					uniqueProducts.add(product);
					report = report + "<div>"
							+ ((FullHDMonitor) product).getId() + "</div><div>"
							+ ((FullHDMonitor) product).getName()
							+ "</div><div>"
							+ ((FullHDMonitor) product).getPrice() + "</div>\n";
				}
			}
			if (product == UHDMonitor.class) {
				int id = ((UHDMonitor) product).getId();
				if (!contains(id, uniqueProducts)) {
					uniqueProducts.add(product);
					report = report + "<div>"
							+ ((FullHDMonitor) product).getId() + "</div><div>"
							+ ((FullHDMonitor) product).getName()
							+ "</div><div>"
							+ ((FullHDMonitor) product).getPrice() + "</div>\n";
				}
			}
			if (product == Monitor.class) {
				int id = ((Monitor) product).getId();
				if (!contains(id, uniqueProducts)) {
					uniqueProducts.add(product);
					report = report + "<div>"
							+ ((FullHDMonitor) product).getId() + "</div><div>"
							+ ((FullHDMonitor) product).getName()
							+ "</div><div>"
							+ ((FullHDMonitor) product).getPrice() + "</div>\n";
				}
			}
		}

		return report;
	}

}
