package io.go2zo.tutorial.springbootmustache.service;

import io.go2zo.tutorial.springbootmustache.api.UserAPI;
import io.go2zo.tutorial.springbootmustache.domain.User;
import io.go2zo.tutorial.springbootmustache.util.RequestUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
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
