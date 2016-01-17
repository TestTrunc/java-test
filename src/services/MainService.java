package services;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Main service.
 */
public class MainService {

    //Injected using DI (e.g. spring)
    private ProductService productService;
    //Injected using DI (e.g. spring)
    private HTMLReportService htmlReportService;
    //Injected using DI (e.g. spring)
    private CSVReportService csvReportService;


    private String getCSVReport() {
        ArrayList products = productService.getAllProducts();
        return csvReportService.generateUniqueProductReport(products);
    }

    private String getHtmlReport() {
        ArrayList products = productService.getAllProducts();
        return htmlReportService.generateUniqueProductReport(products);
    }

    public void prinntReport(String name) {
        if (name == "CSV") {
            String report = getCSVReport();
            try {
                print(report);
            } catch (IOException exception) {
                //print error to console
                System.out.println(exception);
                //Exit method without error
                //System.exit(0);
            }
        }
        if (name == "HTML") {
            String report = getHtmlReport();
            try {
                print(report);
            } catch (IOException exception) {
                //print error to console
                System.out.println(exception);
                //Exit method without error
                //System.exit(0);
            }
        }
    }


    /**
     * Prints given string to some printer.
     *
     * @param report
     * @throws IOException
     */
    void print(String report) throws IOException {
        //PRINT REPORT
        //STUB
    }
}
