/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.TPCSWPractica05;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
/**
 *
 * @author roberto
 */
public class MyUserDetailsService implements UserDetailsService{
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Aquí deberías buscar el usuario en la base de datos.
        if ("admin".equals(username)) {
            return new User("admin", new BCryptPasswordEncoder().encode("password"), Collections.emptyList());
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
    }
}
