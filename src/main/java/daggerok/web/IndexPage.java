package daggerok.web;

import daggerok.domain.UserRestResource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexPage {

    final UserRestResource userRestResource;

    @Value("${SOME_VAR:=(}")
    String someVar;

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("someVar", someVar);
        model.addAttribute("users", userRestResource.findAll());
        return "index";
    }
}
