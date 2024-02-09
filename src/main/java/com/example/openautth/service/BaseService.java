package com.example.openautth.service;

import com.example.openautth.data.entity.User;
import com.example.openautth.data.repository.UserRepository;
import com.example.openautth.domain.model.UserDetails;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BaseService {


    public void validateUserDetails(UserDetails userDetails) {
        //TODO: validate user details
        //TODO: throw exception if user is not valid

        return;
    }


}
