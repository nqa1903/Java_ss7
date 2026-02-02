class User{
    private final int id;

    private String username;
    private String password;

    public User(int id , String username , String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public boolean checkPassword(String password){
        return this.password.equalsIgnoreCase(password);
    }

    @Override
    public String toString(){
        return "User[id = " + id + " , name : " + username + "]";
    }
}

class UserManager{
    static User[] users = new User[10];
    static int count = 0;

    public static void addUser(User user){
        if(count < users.length){
            users[count] = user;
            count++;
            System.out.println("Da them user : "+ user.getUsername());
        }else{
            System.out.println("Danh sach user da day");
        }
    }

    public static boolean checkLogin(String username , String password){
        for(int i = 0 ; i < count ; i++){
            if(users[i].getUsername().equalsIgnoreCase(username) && users[i].checkPassword(password)){
                return true;
            }
        }
        return false;
    }

    public static void showAllUsers(){
        System.out.println("Danh sach nguoi dung :");
        for(int i = 0 ; i < count ; i++){
            System.out.println((i + 1) + ". " +users[i]);
        }
    }
}

public class B6 {
    public static void main(String[] args){
        User u1 = new User(1 , "anh" , "190303");
        User u2 = new User(2 , "quang anh" , "190303anh");
        User u3 = new User(3 , "anh quang" , "190303quang");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println("Da them 3 user");
        UserManager.showAllUsers();

        System.out.println("Kiem tra dang nhap");
        System.out.println("Dang nhap : (anh , 190303) : " + (UserManager.checkLogin("anh" , "190303") ? "Thanh cong" : "That bai"));
        System.out.println("Dang nhap : (anh quang , 190303) : " + (UserManager.checkLogin("anh quang" , "190303") ? "Thanh cong" : "That bai"));

    }
}
