package hh.backend.viikko3.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hh.backend.viikko3.domain.Friend;

    @Controller
    public class FriendController {
    
        private static List<Friend> friends = new ArrayList<>();
        static {
            friends.add(new Friend("Seppo", "Taalasmaa"));
            friends.add(new Friend("Ismo", "Laitela"));
            friends.add(new Friend("Ulla", "Taalasmaa"));
            friends.add(new Friend("Aki", "Nikkinen"));
            friends.add(new Friend("Saku", "Salin"));
        }

        @GetMapping("/addfriend")
        public String addFriend() {
            return "addfriend";
        }

        @PostMapping("/save")
        public String saveFriend(Friend friend) {
            friends.add(friend);
            return "redirect:/friends";
        }

        @GetMapping("/friends")
        public String friendList(Model model) {
            model.addAttribute("friends", friends);
            return "friendlist"; 
        }
}