package com.acciojob.Library_management_system.Controllers;

import com.acciojob.Library_management_system.Entities.Author;
import com.acciojob.Library_management_system.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")

public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("add")
    public String addAuthor(@RequestBody Author author) {

        String result = authorService.addAuthor(author);
        return result;
    }

}