package MikaelBarachoOficial.com.github.todolist_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstPath")
// http://localhost:8080/firstPath --------
public class FirstController {
    
    /*
     * HTTP Methods:
     * 
     * GET
     * POST
     * PUT
     * DELETE
     * PATCH
     * 
     */

    // Class Method:
    @GetMapping("")
    public String firstMessage() {
        return "It worked!\n Hi, me!\n Mikael Baracho made it\n I rock!";
    }

}
