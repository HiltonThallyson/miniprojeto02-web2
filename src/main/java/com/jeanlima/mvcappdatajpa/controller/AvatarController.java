package com.jeanlima.mvcappdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeanlima.mvcappdatajpa.model.Avatar;
import com.jeanlima.mvcappdatajpa.service.AvatarService;
import com.jeanlima.mvcappdatajpa.service.EstudanteService;

@Controller
@RequestMapping("/avatar")
public class AvatarController {

    @Autowired
    @Qualifier("avatarServiceImpl")
    AvatarService avatarService;

    @Autowired
    @Qualifier("estudanteServiceImpl")
    EstudanteService estudanteService;

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("avatar", new Avatar());
        model.addAttribute("estudantes", estudanteService.getListaEstudante());
        return "avatar/formAvatar";
    }

    @RequestMapping("/addAvatar")
    public String addAvatar(@ModelAttribute("avatar") Avatar avatar, Model model) {
        Avatar newAvatar = avatarService.salvarAvatar(avatar);
        estudanteService.getEstudanteById(avatar.getEstudante().getId()).setAvatar(avatar);
        model.addAttribute("avatar", newAvatar);
        return "redirect:getListaAvatares";
    }

    @RequestMapping("/getListaAvatares")
    public String listarAvatares(Model model) {
        model.addAttribute("avatares", avatarService.getListaAvatares());
        return "avatar/listarAvatares";
    }
}
