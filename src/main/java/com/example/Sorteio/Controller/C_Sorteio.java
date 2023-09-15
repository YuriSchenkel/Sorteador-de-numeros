package com.example.Sorteio.Controller;


import com.example.Sorteio.Model.M_Sorteio;
import com.example.Sorteio.Service.S_Sorteio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class C_Sorteio {

    @GetMapping("/")
    public String getSorteio() {
        return "Home/home";
    }

    @PostMapping("/")
    public String PostSorteio(@RequestParam("qtd") int qtd,
                                 @RequestParam("min") int min,
                                 @RequestParam("max") int max,
                                 @RequestParam("ordenar") boolean ordenar,
                                 @RequestParam("repeticao") boolean repeticao,
                                 Model model
    ) {

        M_Sorteio sorteio = S_Sorteio.getSorteioNumero(qtd, min, max, ordenar, repeticao);

        model.addAttribute(("resultados"), sorteio.getResultados());
        model.addAttribute(("qtd"), sorteio.getQtd());
        model.addAttribute(("min"), sorteio.getMin());
        model.addAttribute(("max"), sorteio.getMax());
        model.addAttribute(("dataFormatada"), sorteio.getDataFormatada());

        return "Home/home";
    }

}
