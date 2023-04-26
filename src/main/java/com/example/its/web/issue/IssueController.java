package com.example.its.web.issue;

import com.example.its.domain.issue.IssueEntity;
import com.example.its.domain.issue.IssueService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IssueController {
    // Get /issues
    private final IssueService issueService = new IssueService();
    @GetMapping("/issues")
    public String showList(Model model){

        model.addAttribute("issueList",issueService.findAll());
        return "issues/list";
    }
}
