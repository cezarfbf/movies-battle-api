package com.moviesbattle.moviesbattleapi.service.Impl;

import com.moviesbattle.moviesbattleapi.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class UserServiceImpl implements UserService {

    @Override
    public String getLoggedUser() {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ((UserDetails) principal).getUsername();

    }
}
