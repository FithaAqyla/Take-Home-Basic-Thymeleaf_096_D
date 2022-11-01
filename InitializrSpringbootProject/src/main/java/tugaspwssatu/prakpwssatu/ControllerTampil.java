/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspwssatu.prakpwssatu;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Aqyla-PC
 */
@Controller
public class ControllerTampil {
     @RequestMapping("/well")
     
    public String openWelcome(@RequestParam(value="name")String newUsername,
                              @RequestParam(value="pwd")String newPassword,
                                Model model){
        model.addAttribute("kirimanUsername", newUsername);
        model.addAttribute("kirimanPassword", newPassword);
        return "welcome";
    }
    
    @RequestMapping("/jmlah")
    public String getDataSampling(Model model, HttpServletRequest param){
        String dataa = param.getParameter("senddata1");
//        String dataaa = param.getParameter("senddata2");
        konversiku convert = new konversiku();
        double jml = convert.jumlah(Double.parseDouble(dataa));
        model.addAttribute("data1", jml );
        
        return "dataku";
    }
        
}

class konversiku{
    public double jumlah(double dataku) {
        double jml;
        String nama = "jml";
        
        jml = (dataku + dataku);
        return jml;
    }
}

