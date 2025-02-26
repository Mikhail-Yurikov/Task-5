package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

//        User user1 = new User("1", "1", "@1");
//        User user2 = new User("2", "2", "@2");
//        User user3 = new User("3", "3", "@3");
//        Car car1 = new Car("1", 1);
//        Car car2 = new Car("2", 2);
//        Car car3 = new Car("3", 3);
//        System.out.println(car1);
//        userService.add(user1.setCar(car1).setUser(user1));
//        userService.add(user2.setCar(car2).setUser(user2));
//        userService.add(user3.setCar(car3).setUser(user3));

//        List<User> users = userService.listUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }
        System.out.println(userService.userByCar("1",1));

        context.close();
    }
}
