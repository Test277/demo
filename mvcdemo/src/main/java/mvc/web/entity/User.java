package mvc.web.entity;

import lombok.Data;

@Data
public class User {
    private Long userId;
    private String userName;
    private String password;

    public User(Long id, String userName, String password){
        this.userId = id;
        this.userName = userName;
        this.password = password;
    }
}
