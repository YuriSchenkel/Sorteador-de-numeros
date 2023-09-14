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
    @ResponseBody
    public M_Sorteio PostSorteio(@RequestParam("qtd") int qtd,
                                 @RequestParam("min") int min,
                                 @RequestParam("max") int max,
                                 @RequestParam("ordenar") boolean ordenar,
                                 @RequestParam("repeticao") boolean repeticao
    ) {

        return S_Sorteio.getSorteioNumero(qtd, min, max, ordenar, repeticao);
    }

}
