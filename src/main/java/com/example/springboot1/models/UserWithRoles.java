package com.example.springboot1.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserWithRoles extends User implements UserDetails {

    public UserWithRoles(User user) {

        super(user);  // Call the copy constructor defined in User
    }

    public UserWithRoles(org.springframework.security.core.userdetails.User user) {
    }

//    public UserWithRoles(UserDetails user) {
//    }

//    public UserWithRoles(org.springframework.security.core.userdetails.User user) {
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String roles = "admin,employees,russianHackers"; // Since we're not using the authorization part of the component
        return AuthorityUtils.commaSeparatedStringToAuthorityList(roles);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}