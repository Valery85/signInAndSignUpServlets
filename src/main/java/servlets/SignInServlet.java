package servlets;

import accounts.AccountService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignInServlet extends HttpServlet {

        private AccountService accountService;

        public SignInServlet(AccountService accountService){
            this.accountService = accountService;
        }

    public void doPost (HttpServletRequest request,
                        HttpServletResponse response) throws IOException {

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        response.getWriter().println("Authorized:" + login);
        if (accountService.getUserByLogin(login).getLogin() == login){
            response.getWriter().println("Authorized:" + login);
        }




    }


}
