package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping
public class SkillsController {

    @GetMapping
    //localhost:8080
    public String mainView() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    //localhost:8080/form
    public String mainForm() {
        return "<html>" +
                "<body>" +
                "<form action=''name>" +
                "Name: <input type='text' name='name'><br>" +
                "<label for='l-select'>My favorite language: </label><br>" +
                "<select name='language'><br>" +
                "<option value='java'>Java</option>" +
                "<option value='js'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>"+
                "My second favorite language: <br>" +
                "<select name='language'><br>" +
                "<option value='java'>Java</option>" +
                "<option value='js'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "My third favorite language: <br>" +
                "<select name='language'><br>" +
                "<option value='java'>Java</option>" +
                "<option value='js'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<br><input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
