package com.jeanlima.mvcappdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jeanlima.mvcappdatajpa.model.Avatar;
import com.jeanlima.mvcappdatajpa.repository.AvatarRepository;

@Component
public class AvatarServiceImpl implements AvatarService {

    @Autowired
    AvatarRepository avatarRepository;

    @Override
    public Avatar getAvatarById(Integer id) {
        return avatarRepository.findById(id).map(avatar -> {
            return avatar;
        }).orElseThrow(
                () -> null);
    }

    @Override
    public Avatar salvarAvatar(Avatar avatar) {
        return avatarRepository.save(avatar);
    }

    @Override
    public List<Avatar> getListaAvatares() {
        return avatarRepository.findAll();
    }

}
