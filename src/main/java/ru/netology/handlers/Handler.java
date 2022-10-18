package ru.netology.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Handler {
    void handle(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}
