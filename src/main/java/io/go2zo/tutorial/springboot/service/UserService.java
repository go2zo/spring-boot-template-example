package io.go2zo.tutorial.springboot.service;

import io.go2zo.tutorial.springboot.api.UserAPI;
import io.go2zo.tutorial.springboot.domain.User;
import io.go2zo.tutorial.springboot.util.RequestUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserAPI userAPI;

    public Optional<List<User>> getUserList() {
        return RequestUtil.requestSync(userAPI.getUserList());
    }
}
