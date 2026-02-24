package account_observer;

public interface SignInListener {

  // the sign process is in progress, we can show a loading indicator to the user.
  void onLoading();

  // @param user the user that has been signed in successfully, we can show the user's name and other information to the user.
  void onSuccess(User user);

  // @param error returns an error message if the sign in process fails, we can show the error message to the user.
  void onError(String error);
}