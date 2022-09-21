package com.jeanlima.mvcappdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeanlima.mvcappdatajpa.model.Avatar;
import com.jeanlima.mvcappdatajpa.service.AvatarService;

@Controller
@RequestMapping("/avatar")
public class AvatarController {

    @Autowired
    AvatarService avatarService;

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("avatar", new Avatar());
        return "avatar/formAvatar";
    }

    @RequestMapping("/addAvatar")
    public String addAvatar(@ModelAttribute("avatar") Avatar avatar, Model model) {
        Avatar newAvatar = avatarService.salvarAvatar(avatar);
        model.addAttribute("avatar", newAvatar);

        return "avatar/listaAvatar";
    }
}
