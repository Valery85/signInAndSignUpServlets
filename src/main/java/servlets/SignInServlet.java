package servlets;

import accounts.AccountService;
import accounts.UserProfile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignInServlet extends HttpServlet {
    private AccountService accountService;

    public SignInServlet (AccountService accountService) {
        this.accountService = accountService;
    }
    public void doPost (HttpServletRequest request, HttpServletResponse response){
        String login = request.getParameter("login");
        String pass = request.getParameter("password");

        UserProfile userProfile = new UserProfile(login,pass);

        accountService.addNewUser(userProfile);


    }
}
