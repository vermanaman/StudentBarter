package com.barter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.barter.domain.User;
import com.barter.domain.repository.UserRepository;

@Repository
public class UserDetailServiceImpl implements UserDetailsService  {

    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException, DataAccessException
    {
        System.out.println("GETTING LOGIN DETAILS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + username);
        
                List<GrantedAuthority> gas = new ArrayList<GrantedAuthority>();
//        gas.add(new GrantedAuthorityImpl("ROLE_USER"));
                User findByEmail = repo.findByUsername(username);
        UserDetails user = new org.springframework.security.core.userdetails.User(
            username, findByEmail.getPassword(), true, true, true, true, gas);
        return user;
    }
}