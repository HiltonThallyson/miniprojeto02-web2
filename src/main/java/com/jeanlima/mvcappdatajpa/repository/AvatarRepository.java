package com.jeanlima.mvcappdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanlima.mvcappdatajpa.model.Avatar;

public interface AvatarRepository extends JpaRepository<Avatar, Integer> {

}
