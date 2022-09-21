package com.jeanlima.mvcappdatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jeanlima.mvcappdatajpa.model.Avatar;
import com.jeanlima.mvcappdatajpa.repository.AvatarRepository;

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

}
