package champ.champion;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/shru")
public class EngliController {

    @Autowired
    private IEngliRepository iEngliRepos;

 @PostMapping("/chipkao")
 public void saveData(@RequestBody Engli engli){
 iEngliRepos.save(engli);
 }
                                                                        

 @GetMapping("/uthao")
 public List<Engli> getData(){
    return  iEngliRepos.findAll();
    
 }
}
