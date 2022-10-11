package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @ResponseBody
    //localhost:8080/form
    public String mainForm() {
        return "<html>" +
                "<body>" +
                "<form action='results' method='post'>" +
                "Name: <input type='text' name='name'><br>" +
                "<label for='l-select'>My favorite language: </label><br>" +
                "<select name='oneLanguage'><br>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "My second favorite language: <br>" +
                "<select name='twoLanguage'><br>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "My third favorite language: <br>" +
                "<select name='threeLanguage'><br>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<br><input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

//    @RequestMapping(method = RequestMethod.POST)
//    @ResponseBody
//    public String resultForm(@RequestParam String name, @RequestParam String oneLanguage, @RequestParam String twoLanguage, @RequestParam String threeLanguage) {
//        return createForm(name, oneLanguage,twoLanguage,threeLanguage);
//    }

    @PostMapping("/results")
    @ResponseBody
    public String createForm(@RequestParam String name,@RequestParam String oneLanguage,@RequestParam String twoLanguage,@RequestParam String threeLanguage) {

        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + oneLanguage + "</li>" +
                "<li>" + twoLanguage + "</li>" +
                "<li>" + threeLanguage + "</li>" +
                "</ol>" +
                "<table>" +
                "<tr><th>First Language</th><th>Second Language</th><th>Third Language</th></tr>" +
                "<tr><td>" + oneLanguage + "</td><td>" + twoLanguage + "</td><td>" + threeLanguage + "</td></tr>" +
                "</table>"+
                "</body>" +
                "</html>";
    }


}