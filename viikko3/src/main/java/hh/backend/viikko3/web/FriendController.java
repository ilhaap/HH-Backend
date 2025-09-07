package hh.backend.viikko3.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hh.backend.viikko3.domain.Friend;

    @Controller
    public class FriendController {
    
        @GetMapping("/addfriend")
        public String addFriend() {
            return "addfriend";
        }

            @PostMapping("/save")
        public String saveFriend(Friend friend, Model model) {
            model.addAttribute("friend", friend);
            return "result";
        }
    }