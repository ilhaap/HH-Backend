package hh.backend.viikko2.web;
import hh.backend.viikko2.domain.Student;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    public static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("Seppo", "Taalasmaa"));
        students.add(new Student("Ismo", "Laitela"));
        students.add(new Student("Aki", "Nikkinen"));
        students.add(new Student("Tero", "Testaaja"));
    }

     @GetMapping("/list")
    public String showStudents(Model model) {
        model.addAttribute("students", students);
        return "studentlist";
    }
}