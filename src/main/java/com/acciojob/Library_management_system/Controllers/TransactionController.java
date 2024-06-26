package com.acciojob.Library_management_system.Controllers;


import com.acciojob.Library_management_system.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")

public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PutMapping("issueBook")
    public String issueBook(@RequestParam("cardId")Integer cardId,
                            @RequestParam("bookId")Integer bookId) {

        try{
            String result = transactionService.issueBook(bookId,cardId);
            return result;
        }catch (Exception e){
            return e.getMessage();
        }

    }
}
