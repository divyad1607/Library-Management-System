package com.acciojob.Library_management_system.Controllers;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")

public class TransactionController {

    @PutMapping("issueBook")
    public String issueBook(@RequestParam("cardId")Integer caedId,
                            @RequestParam("bookId")Integer bookId) {


    }
}
