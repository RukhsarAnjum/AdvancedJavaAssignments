package trainingweb.service;

public class UserManagerImpl implements UserManager{
    @Override
    public Boolean verifyUsernameAndPassword(String username, String password) {
        if(username.equals("Rukhsar")&& password.equals("Rukh")){
            return true;
        }
        return false;

    }
}
