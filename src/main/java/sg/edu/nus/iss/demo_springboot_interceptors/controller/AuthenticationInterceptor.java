package sg.edu.nus.iss.demo_springboot_interceptors.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        System.out.println("Intercepting: " + request.getRequestURI());

        HttpSession session = request.getSession();
        if (session.getAttribute("username") == null) {
            //Must put /login instead of login because it is a relative path. /login is an absolute path.
            response.sendRedirect("/login");
            return false;
        } else {
            return true;
        }
    }
}
