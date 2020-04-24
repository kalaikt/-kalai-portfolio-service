package com.kalai.profile.controllers;

import com.kalai.profile.models.AuthRequest;
import com.kalai.profile.models.AuthResponse;
import com.kalai.profile.models.User;
import com.kalai.profile.services.UserService;
import com.kalai.profile.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

  @Autowired private UserService userService;

  @Autowired private JwtUtil jwtUtil;
  @Autowired private AuthenticationManager authenticationManager;

  @GetMapping
  public Iterable<User> getAll() {

    return userService.getAll();
  }

  @PostMapping("/authenticate")
  public AuthResponse generateToken(@RequestBody AuthRequest authRequest) throws Exception {
    try {
      authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(
              authRequest.getUserName(), authRequest.getPassword()));
    } catch (Exception ex) {
      throw new Exception("Invalid username/password");
    }

    AuthResponse authResponse = new AuthResponse();
    authResponse.setJwt(jwtUtil.generateToken(authRequest.getUserName()));
    return authResponse;
  }
}
