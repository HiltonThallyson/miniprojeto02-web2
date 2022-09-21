package com.jeanlima.mvcappdatajpa.service;

import com.jeanlima.mvcappdatajpa.model.Avatar;

public interface AvatarService {
    public Avatar salvarAvatar(Avatar avatar);

    public Avatar getAvatarById(Integer id);

}
