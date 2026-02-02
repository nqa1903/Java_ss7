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

    public void setPassword(String password){
        this.password = password;
    }

    public void displayInfo(){
        System.out.println("Id : " + id);
        System.out.println("Username : "+username);
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

    public static User findUsername(String username){
        for(int i = 0 ; i < users.length ; i++){
            if(users[i].getUsername().equalsIgnoreCase(username)){
                return users[i];
            }
        }
        return null;
    }
}

public class B6 {
    public static void main(String[] args){
        User u1 = new User(1 , "anh" , "190303");
        User u2 = new User(2 , "quang anh" , "190303");

        UserManager.addUser(u1);
        UserManager.addUser(u2);

        User found = UserManager.findUsername("anh");
        if(found != null){
            System.out.println("Da tim thay user : ");
            found.displayInfo();
        }else{
            System.out.println("Khong tim thay user");
        }
    }
}
