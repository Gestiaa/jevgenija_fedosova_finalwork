package lv.lu.finalwork;

import lv.lu.finalwork.config.AppConfiguration;
import lv.lu.finalwork.repository.ProductRepository;
import lv.lu.finalwork.ui.ConsulUI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductAccountingApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        ProductRepository productRepository = context.getBean (ProductRepository.class);
 //       ProductMapper productMapper =  context.getBean();
  //      ProductService service = context.getBean (ProductService.class);
   //     Scanner scanner = new Scanner(System.in);
        ConsulUI consulUI = context.getBean(ConsulUI.class);
        consulUI.startUi();
    }

}
