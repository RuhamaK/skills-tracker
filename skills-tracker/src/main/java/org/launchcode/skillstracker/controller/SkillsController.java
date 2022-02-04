package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("favoriteSkills")
public class SkillsController {

    //At localhost:8080, add text that states the three possible programming languages
    // someone could be working on. You need to have an h1 with the title “Skills Tracker”, an h2, and an ol containing three programming languages of your choosing.

    @GetMapping("skills")
    public String skillsTracker(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here is a list of the skills we would like to learn!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    //At localhost:8080/form, add a form that lets the user enter their name and choose their favorite,
    // second favorite, and third favorite programming languages
    //on your list. Use select elements for each of the rankings. Just as with the exercises, we will use @GetMapping().
@GetMapping("forms")
    public String createForm(){
        return "<html>" +
                "<body>" +
                "<form method='post', action = '/favoriteSkills'>" +
                "<h3>Name:</h3>"+
                "<input name='name',type = 'text'>" +
                "<h3>My favorite language</h3>" +
                "<select name = 'skills1'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>"+
                "<h3>My second favorite language</h3>" +
                "<select name = 'skills2'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>"+
                "<h3>My third favorite language</h3>" +
                "<select name = 'skills3'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>"+
                "<input type = 'submit' value ='Submit'>" +
                "</body>" +
                "</html>";
}

//    Also at localhost:8080/form, use @PostMapping and @RequestParam to update the HTML
//    with an h1 stating the user’s name and an ol showing the three programming languages in the order they chose

    @PostMapping
    public String userForm(@RequestParam String name, String skills1, String skills2, String skills3){
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>"+
                "<ol>" +
                "<li>" + skills1 + "</li>" +
                "<li>" + skills2 +"</li>" +
                "<li>" + skills3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }

}

