package suptech.miage.tp3.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import suptech.miage.tp3.metier.IProductMetier;

@Controller
public class HelloController {

    private final IProductMetier metier;

    public HelloController(IProductMetier metier) {
        this.metier = metier;
    }

    @GetMapping(path = "/products")
    public String products(Model model){
        try {
            model.addAttribute("products",metier.getProducts());
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error",e.getMessage());
        }
        return "products";
    }
}
